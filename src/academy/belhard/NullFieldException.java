package academy.belhard;

public class NullFieldException extends Exception{
    public NullFieldException(String message) {
        super("Поля должны быть заполнены");
    }

}
