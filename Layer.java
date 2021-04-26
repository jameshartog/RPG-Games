/**
 * The Floor/Event System in which non-battle related parts are contained
 *
 * @author (JJH)
 * @version (1.0)
 */
import java.util.Scanner;
public class Layer {
    public static Scanner userInput = new Scanner(System.in);
    public static String cont = "yes";
    //Floor
    public static int i;
    
    //Floors
    static void levelOne() {
        i = 1;
        entrance();
        battleStart();
    }
    
    //Code Simplifiers
    static void header() {
        System.out.println("Labrinth Level " + i);
    }
    
    static void next() {
        while (cont.equals("yes")) {
            System.out.println("(Enter Anything to Continue)");
            cont = userInput.next();
        }
        cont = "yes";
        clear();
    }
    
    static void clear() {
        System.out.print('\u000C');
    }
    
    //Room Events Below
    static void entrance() {
        header();
        System.out.println("[Placeholder Text]");
        next();
    }
    
    static void battleStart() {
        header();
        System.out.println("[Placeholder]");
        next();
        Combat.start();
    }
}
