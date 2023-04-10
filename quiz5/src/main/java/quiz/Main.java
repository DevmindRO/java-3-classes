package quiz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import quiz.config.StudentConfiguration;
import quiz.domain.Student;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);

        Student studentSingleton1 = context.getBean("student", Student.class);
        Student studentSingleton2 = context.getBean("student", Student.class);

        System.out.println("Should be singleton beans: " + (studentSingleton1 == studentSingleton2));
        System.out.println("First name is: " + studentSingleton1.getFirstName());

        Student studentPrototype1 = context.getBean("studentPrototype", Student.class);
        Student studentPrototype2 = context.getBean("studentPrototype", Student.class);

        System.out.println("Should not be singleton beans: " + !(studentPrototype1 == studentPrototype2));
        System.out.println("Student details: " + studentPrototype1.getFirstName());
    }
}
