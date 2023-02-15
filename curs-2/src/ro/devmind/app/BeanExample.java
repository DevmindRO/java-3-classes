package ro.devmind.app;

public class BeanExample {
    public void randomPublicMethod(int intParam, String stringParam) {
        System.out.println("I am in randomPublicMethod");
    }

    void randomPackagePrivateMethod() {
        System.out.println("I am in randomPackagePrivateMethod");
    }

    private void loggablePackagePrivateMethod() {
        System.out.println("I am in loggablePackagePrivateMethod");
    }

    public void callInternalLog() {
        this.loggablePackagePrivateMethod();
    }

    public void throwErrorWhenZero(int value) throws Exception {
        if (value == 0) {
            throw new Exception("Zeros are bad");
        }
        System.out.println("Method called successfully");
    }
}