package Exceptii;

public class ValidationFailedExeption extends Exception{
    public ValidationFailedExeption() {
    }

    public ValidationFailedExeption(String message) {
        super(message);
    }
}
