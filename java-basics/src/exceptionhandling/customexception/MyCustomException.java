package exceptionhandling.customexception;

public class MyCustomException extends Exception{
    MyCustomException(String message) {
        super(message);
    }
}
