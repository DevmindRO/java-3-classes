package devmind.controller;

import devmind.service.NumbersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumbersController {

    private final NumbersService numbersService;

    public NumbersController(NumbersService numbersService) {
        this.numbersService = numbersService;
    }

    @GetMapping(value = "/add/first/{first}/second/{second}")
    public ResponseEntity<String> sum(@PathVariable String first, @PathVariable String second) {
        String result = numbersService.add(first, second).toString();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping(value = "/add-large/first/{first}/second/{second}")
    public ResponseEntity<String> sumLarge(@PathVariable String first, @PathVariable String second) {
        String result = numbersService.addLargeNumbers(first, second).toString();
        return ResponseEntity.ok().body(result);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> sumException() {
        return ResponseEntity.badRequest().body("Incorrect parameters specified.");
    }
}
