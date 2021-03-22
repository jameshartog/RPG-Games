/**
 * Enemy Object List
 *
 * @author (JJH)
 * @version (1.0)
 */
import java.util.Scanner;
public class Floor
{
    public static Scanner userScan = new Scanner(System.in);
    public static int i = 0;
    public static String cont = "yes";
    //Clear
    static void clear() {
        System.out.print('\u000C');
    }
    
    //Level 1
    public static void levelOne() {
        //Route Plan: Entrance> Battle> Battle> Chest (Player Type Selection)> Exit
        entrance();
        battle();
        battle();
        //Chest();
        //Exit();
    }
    
    //Room Types (Battle rooms will transfer to a battle class)
    //Types: Entrance, Battle, Chest (Class selection), Event, Exit, etc.
    //Variables change the room event specifics (most prevelant in Battle)
    public static void entrance() {
        i++;
        System.out.println("A faint glow can be seen as you move down the passage");
        System.out.print("As you reach the door a series of characters light up ");
        System.out.println("Reading:");
        while (cont.equals("yes")) {
            if (i == 1) {
                System.out.println("\"Labyrinth Level " + i + "\"");
                System.out.println("[Placeholder]");
                System.out.println("[Placeholder]");
            }
            System.out.println("(Enter Anything to Continue)");
            cont = userScan.next();
        }
        clear();
        cont = "yes";
        while (cont.equals("yes")) {
            System.out.println("[Placeholder]");
            System.out.println("Suddenly a darkness consumes you and you blackout");
            System.out.println("(Enter Anything to Continue)");
            cont = userScan.next();
        }
        clear();
    }
    
    public static void battle() {
        System.out.print("You awaken to find yourself [Placeholder]");
        cont = "yes";
        while (cont.equals("yes")) {
            System.out.println("(Enter Anything to Continue)");
            cont = userScan.next();
        }
        //Swap to Battle Class Code
    }
}
