/**
 * Floor/Event System; essentially the heart of the non-battle segment
 *
 * @author (JJH)
 * @version (1.0)
 */
import java.util.Scanner;
public class Floor
{
    public static Scanner userScan = new Scanner(System.in);
    public static int i = 1;
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
        character();
        exit();
    }
    
    //Room Types (Battle rooms will transfer to a battle class)
    //Types: Entrance, Battle, Chest (Class selection), Event, Exit, etc.
    //Variables change the room event specifics (most prevelant in Battle)
    public static void entrance() {
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
        clear();
        System.out.print("You awaken to find yourself [Placeholder]");
        cont = "yes";
        while (cont.equals("yes")) {
            System.out.println("(Enter Anything to Continue)");
            //Temp Warning
            System.out.println("Anything past this point is incomplete and will result in a loop");
            cont = userScan.next();
        }
        //Swap to Battle Class Code
        Battle.combat();
    }
    
    //Beginning character selection after first battle
    public static void character() {
        
    }
    
    public static void exit() {
        clear();
        System.out.print("A section of the wall collapses to reveal a staircase");
        cont = "yes";
        while (cont.equals("yes")) {
            if (i == 1) {
                System.out.println("\"Labyrinth Exit " + i + "\"");
                System.out.println("[Placeholder]");
                System.out.println("[Placeholder]");
            }
            
            System.out.println("(Enter Anything to Continue)");
            cont = userScan.next();
            
        }
        i++;
    }
    
    public static void end() {
        clear();
        System.out.println("This reaches the end of the current version");
    }
}
