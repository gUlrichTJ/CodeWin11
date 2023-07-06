package tp;

/**
 * @author time
 */
public class Main1 {

    public static void main(String[] args) {
// instance de Film
        Film br1982 = new Film(1, "Blade Runner", 1982, 1.95f);
// sérialisation en tant que chaîne
        System.out.println(br1982.toString());
    }
}
