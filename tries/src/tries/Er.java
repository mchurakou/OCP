package tries;

/**
 * Created by mikalai on 2/7/2017.
 */
public class Er {
    public static void main(String[] args) {
        try {
            main(args);
        } finally {
            main(args);
        }
    }
}
