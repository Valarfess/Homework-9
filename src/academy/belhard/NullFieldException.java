package academy.belhard;

public class NullFieldException extends Exception{
    public NullFieldException(String message) {
        super("Error! Поля должны быть заполнены");
    }

}
