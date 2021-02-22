package academy.belhard;

public class EmptySourceFileException extends Exception {
    public EmptySourceFileException (String message) {
        super("Error! Файл пуст или отсутствует");
    }

}
