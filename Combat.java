/**
 * The main Combat program
 *
 * @author (JJH)
 * @version (1.0)
 */
import java.util.Scanner;
public class Combat {
    public static int e; //Enemy Type
    public static int t = 0; //Turn counter
    public static Scanner userScan = new Scanner(System.in);
    public static String cont = "yes";
    
    static void clear() {
        System.out.print('\u000C');
    }
    
    //Enemy Randomizer and Activator
    static void randomActivation() {
        //e = (int)(Math.random() * (max - min + 1) + min);
        if (Layer.i == 1) {
            e = (int)(Math.random() * (1 - 1 + 1) + 1);
        }
        Entity.setActive();
    }
    
    //Interface
    static void inter() {
        clear();
        System.out.println("Labrinth Level " + Layer.i);
        System.out.println("Turn: " + t);
        System.out.println("____________________");
        System.out.println(Entity.activeName);
        System.out.println("HP: " + Entity.healthBar + "/" + Entity.activeHealth);
        System.out.println("--------------------");
        System.out.println("Player");
        System.out.println("HP: " + Entity.playerHealth + "/" + Entity.playerHealthBar);
        System.out.println("--------------------");
    }
    
    //Player Turn
    static void playerTurn() {
        inter();
        if (Entity.playerAttribute.equals("None")) {
            System.out.println("Attack Options:");
            System.out.println("[Block]");
            System.out.println("[Firebolt]");
            System.out.println("[Slash]");
            System.out.println("[Crush]");
            System.out.println("--------------------");
        }
        String attack = userScan.next();
        double damage = 0;
        double actualDamage;
        if (Entity.activeName.equals("Slime")) {
            if (attack.equals("") || attack.equals("[]")) {
                damage = 3;
            }
            else if (attack.equals("") || attack.equals("[]")) {
                damage = 3;
            }
            else if (attack.equals("") || attack.equals("[]")) {
                damage = 3;
            }
            else if (attack.equals("") || attack.equals("[]")) {
                damage = 3;
            }
        }
        actualDamage = damage * Entity.playerStrength / Entity.activeDefence;
        int IntDamage = (int) actualDamage;
    }
    
    //Enemy Turn
    static void enemyTurn() {
        inter();
        
    }
    
    public static void start() {
        
    }
}