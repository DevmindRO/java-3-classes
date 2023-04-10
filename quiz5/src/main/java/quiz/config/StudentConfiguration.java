package quiz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import quiz.domain.Student;

@Configuration
@PropertySource("classpath:file.properties")
public class StudentConfiguration {

    @Value("${lastName}")
    private String lastName;

    @Value("${firstName}")
    private String firstName;

    @Value("${grade}")
    private Double grade;

    @Bean
    public Student student() {
        return new Student("Munteanu", "Ciprian", 9.99);
    }

    @Bean
    @Scope("prototype")
    public Student studentPrototype() {
        Student student = new Student();
        student.setLastName(lastName);
        student.setFirstName(firstName);
        student.setGrade(grade);
        return student;
    }
}
