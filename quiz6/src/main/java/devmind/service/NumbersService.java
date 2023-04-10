package devmind.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class NumbersService {

    public Long add(String first, String second) {
        Long firstNum = Long.valueOf(first);
        Long secondNum = Long.valueOf(second);
        return firstNum + secondNum;
    }

    public BigInteger addLargeNumbers(String first, String second) {
        BigInteger firstNum = new BigInteger(first);
        BigInteger secondNum = new BigInteger(second);
        return firstNum.add(secondNum);
    }
}
