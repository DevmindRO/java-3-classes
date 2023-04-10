package quiz.domain;

public class Student {

    String lastName;
    String firstName;
    Double grade;

    public Student() {
    }

    public Student(String lastName, String firstName, Double grade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.grade = grade;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
