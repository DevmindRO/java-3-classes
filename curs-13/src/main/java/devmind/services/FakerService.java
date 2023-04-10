package devmind.services;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class FakerService {

    private final Faker faker;

    public FakerService() {
        this.faker = new Faker();
    }

    public String getHarryPotterCharacter() {
        return faker.harryPotter().character();
    }
}
