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
        firstEntrance();
        battleStart();
    }
    
    //Code Simplifiers
    static void header() {
        System.out.println("Labrinth Level " + i);
        System.out.println("____________________");
    }
    
    static void next() {
        while (cont.equals("yes")) {
            System.out.println("(Enter Anything to Continue)");
            cont = userInput.next();
        }
        cont = "yes";
        clear();
        header();
    }
    
    static void clear() {
        System.out.print('\u000C');
    }
    
    //Room Events Below
    static void firstEntrance() {
        header();
        System.out.println("You awaken to find yourself within a void");
        next();
        System.out.println("A light flashes and a dimly lit staircase appears");
        System.out.println("You find a simple sword and spellbook at your side");
        next();
        System.out.println("Contained within the spellbook is many arcane symbols");
        System.out.println("The only pages you can read contain the instructions for");
        System.out.println("The spells [Zap] and [Firebolt]");
        next();
        System.out.println("You pick up the spellbook and sword");
        System.out.println("...");
        next();
        System.out.println("With nothing left to do you descend down the dark stairs");
        next();
    }
    
    static void combatTutorial() {
        System.out.println("Tutorial Preface:");
        System.out.println("Combat in this RPG game uses a turn-based system");
        System.out.println("The player's first turn marks the beginning");
        System.out.println("The player chooses from a list of [Attacks] to use against the enemy");
        System.out.println("The damage is then calculated and dealt onto the enemy");
        System.out.println("The enemy then begins its turn and deals damage to the player");
        System.out.println("The turn then ends and if the player or enemy's hp falls below 0");
        System.out.println("The combat ends in a game over or victory");
        next();
    }
    
    static void demo() {
        System.out.println("Thank you for playing;");
        System.out.println("Feel free to view the program's coding itself to view all");
        System.out.println("the code I was unable to incorporate due to time constraints");
    }
    
    static void battleStart() {
        System.out.println("The staircase flattens out into a dimly lit room");
        System.out.println("Suddenly a blur jumps at you and combat begins");
        while (cont.equals("yes")) {
            System.out.println("(Enter Anything to Continue)");
            cont = userInput.next();
        }
        cont = "yes";
        clear();
        combatTutorial();
        Combat.start();
        demo();
    }
}
