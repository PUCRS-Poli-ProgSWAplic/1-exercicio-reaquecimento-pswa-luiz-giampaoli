
public class Incremental {
    private static Incremental instance;
    private static int count = 0;
    private int numero;

    public static Incremental getInstance() {
        if (Incremental.instance == null) {
            return new Incremental();
        } else {
            return  Incremental.instance;
        }
    }

    private Incremental() {
        numero = ++count;
    }
    public String toString() {
        return "Incremental " + numero;
    }
}

