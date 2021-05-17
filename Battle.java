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
    public static int playerHP;
    public static int playerMaxHP;
    public static double playerStrength;
    public static double playerDefence;
    
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
        
        //PlayerHidden variables: activeStrength, activeDefence, & activeAttribute
    }
    
    public static void playerHeader() {
        System.out.println("Player");
        System.out.println("HP: " + playerHP + "/" + playerMaxHP);
        System.out.println("--------------------");
        System.out.println("Turn: " + t);
    }
    
    public static void interfaces() {
        header();
        playerHeader();
    }
    
    public static void opponentTurn() {
        interfaces();
        //if monster = slime then _ Moves
        //Player input anything to continue
        //Random move with weights to them
    }
    
    public static void playerMoveset() {
        //Print Move Options
        //if (playerAttribute.equals("None")) {
            System.out.println("Input Player Attack Options:");
            System.out.println("[Slash]");
            System.out.println("[Crush]");
            System.out.println("[Pierce]");
            System.out.println("[Stengthen]");
            System.out.println("[Fortify]");
        //}
        //Player Input
        String attack = userScan.next();
        
        //Outcome
        double damage = 0;
        double actualDamage;
        
        if (attack.equals("Slash") || attack.equals("[Slash]")) {
            if (Enemy.activeName.equals("Slime")) {
                damage = 3;
            }
        }
        actualDamage = damage * playerStrength / Enemy.activeDefence;
        int IntDamage = (int) actualDamage;
        //Enemy.healthBar
        //Player stats are all 1 while Monster stats varry
    }
    
    public static void playerTurn() {
        interfaces();
        //playerMoveset/Input
    }
    
    public static void combat() {
        activateEnemy();
        playerHP = 25;
        playerMaxHP = 25;
        playerStrength = 1;
        playerDefence = 1;
        while (Enemy.healthBar > 0) {
            playerTurn();
            opponentTurn();
            t++;
        }
        //Need a separate block for continual battle and enemy actions
    }
}
