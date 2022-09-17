package exception;

public class CalculatorWrongParameterException extends  IllegalArgumentException {
    public CalculatorWrongParameterException() {
    }

    public CalculatorWrongParameterException(String s) {
        super(s);
    }

    public CalculatorWrongParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculatorWrongParameterException(Throwable cause) {
        super(cause);
    }
}
