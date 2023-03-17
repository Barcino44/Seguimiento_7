package Exception;

public class DeletingNegativeWeightException extends RuntimeException {
    public DeletingNegativeWeightException(){
        super("No puedes ingresar valores negativos");
    }
}
