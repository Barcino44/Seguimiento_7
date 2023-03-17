package Exception;

public class AddingNegativeWeightException extends RuntimeException {
    public AddingNegativeWeightException(){
        super("Estas anadiendo un peso negativo");
    }
}
