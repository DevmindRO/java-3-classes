package devmind.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class MathRequest {

    private Long firstNumber;
    private Long secondNumber;
    private Operation operation;

    public enum Operation {
        sum, difference, multiply, divide, power
    }
}
