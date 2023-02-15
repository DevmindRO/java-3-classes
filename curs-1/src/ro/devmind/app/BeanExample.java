package ro.devmind.app;

public class BeanExample {
    public void randomPublicMethod(int intParam, String stringParam) {
        System.out.println("I am in randomPublicMethod");
    }

    void randomPackagePrivateMethod() {
        System.out.println("I am in randomPackagePrivateMethod");
    }

    void loggablePackagePrivateMethod() {
        System.out.println("I am in loggablePackagePrivateMethod");
    }
}