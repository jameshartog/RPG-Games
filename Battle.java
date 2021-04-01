/**
 * The main Battle program
 *
 * @author (JJH)
 * @version (1.0)
 */
import java.util.Scanner;
public class Battle
{
    public static Scanner userScan = new Scanner(System.in);
    public static String cont = "yes";
    public static double curHP;
    public static int e = 1; //enemy type
    public static int t = 0; //Turn counter
    //Clear
    static void clear() {
        System.out.print('\u000C');
    }
    
    //Should create a more concise system to make an active enemy in this class
    //The idea being the active enemy status and changeable status
    public static void activateEnemy() {
        //Temporarily only the slime is active for combating
        e = 1;
        Enemy.setEnemy();
    }
    
    public static void header() {
        clear();
        System.out.println("____________________");
        System.out.println(Enemy.activeName);
        System.out.println("HP: " + Enemy.healthBar + "/" + Enemy.activeHealth);
        System.out.println("--------------------");
        System.out.println("Turn: " + t);
        //pixelArt();
        //PlayerHidden variables: activeStrength, activeDefence, & activeAttribute
    }
    
    //Nulled
    public static void pixelArt() {
        if (Enemy.activeName.equals("Slime")) {
            
        }
    }
    
    public static void interfaces() {
        header();
        //moveset();
        //playerInput()
    }
    
    public static void opponentTurn() {
        header();
        //Random move with weights to them
    }
    
    public static void playerTurn() {
        interfaces();
    }
    
    public static void combat() {
        activateEnemy();
        while (Enemy.healthBar > 0) {
            playerTurn();
            opponentTurn();
            t++;
        }
        //Need a separate block for continual battle and enemy actions
    }
}
