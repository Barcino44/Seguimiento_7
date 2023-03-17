package Exception;

public class DeletingNegativeWeightException extends RuntimeException {
    public DeletingNegativeWeightException(){
        super("Estas removiendo un peso negativo");
    }
}
