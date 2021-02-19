package academy.belhard;

public class NullFieldException extends Exception{
    public NullFieldException(String message) {
        super("Где-то всунул 'null'? Так не пойдет, переделывай давай.");
    }

}
