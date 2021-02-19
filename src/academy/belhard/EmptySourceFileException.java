package academy.belhard;

public class EmptySourceFileException extends Exception {
    public EmptySourceFileException (String message) {
        super("Не, показалось. Нету там ничего...");
    }
}
