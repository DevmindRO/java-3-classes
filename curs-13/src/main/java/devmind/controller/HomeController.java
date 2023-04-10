package devmind.controller;

import devmind.domain.CustomResponse;
import devmind.domain.MathRequest;
import devmind.services.FakerService;
import devmind.services.MathService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final FakerService fakerService;

    private final MathService mathService;

    @RequestMapping(value = "/time", method = RequestMethod.GET)
    public ResponseEntity<CustomResponse> getTime(@RequestParam String timeZone) {
        timeZone = timeZone.toUpperCase();
        validateTimeZone(timeZone);
        LocalDateTime dateTime = LocalDateTime.now(ZoneId.of(timeZone, ZoneId.SHORT_IDS));
        String currentTime = DateTimeFormatter.ofPattern("HH:mm:ss").format(dateTime);
        CustomResponse response = CustomResponse.builder()
                .result(currentTime)
                .build();

        return ResponseEntity.ok().body(response);
    }

    private void validateTimeZone(String timeZone) {
        List<String> accepted = List.of("UTC", "CET", "EET", "GMT", "EAT");
        if (!accepted.contains(timeZone)) {
            throw new IllegalArgumentException("Timezone not supported");
        }
    }

    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleException() {
        return ResponseEntity.ok().body("The parameter is not OK");
    }

    @RequestMapping(value = "/harry-potter", method = RequestMethod.GET)
    public ResponseEntity<CustomResponse> getHarryPotterCharacter() {
        CustomResponse response = CustomResponse.builder()
                .result(fakerService.getHarryPotterCharacter())
                .build();

        return ResponseEntity.ok().body(response);
    }

    @RequestMapping(value = "/math-service", method = RequestMethod.POST)
    public ResponseEntity<CustomResponse> postMathCalculation(@RequestBody MathRequest mathRequest) {
        CustomResponse response = CustomResponse.builder()
                .result(mathService.compute(mathRequest).toString())
                .build();

        return ResponseEntity.ok().body(response);
    }
}
