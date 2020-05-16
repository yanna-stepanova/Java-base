package Lessons.exception;

public class InvalidAgeException extends IllegalArgumentException {
    private static final String MESSAGE_TEMPLATE = "Age value must be greater than 0. But %s " +
                                                   "value was given!";
    private String message;

    public InvalidAgeException(int age) {
        this.message = String.format(MESSAGE_TEMPLATE, age);
    }

    @Override
    public String getMessage(){
        return message;
    }
}
