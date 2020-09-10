package Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class ArrayListException extends Exception {

    private static final long serialVersionUID = 1808589202777830387L;

    public ArrayListException() {
    }

    @Override
    public String getMessage() {
        List<StackTraceElement> stackTraceElements = new ArrayList<>();
        for (StackTraceElement element : this.getStackTrace()) {
            stackTraceElements.add(element);
        }

        return stackTraceElements.toString();
    }

    ResourceBundle labels = ResourceBundle.getBundle("text", Locale.CANADA);

    @Override
    public String getLocalizedMessage() {
        return labels.getString(getMessage());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
