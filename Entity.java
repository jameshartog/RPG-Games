/**
 * Entities Object List
 *
 * @author (JJH)
 * @version (1.0)
 */
import java.util.Scanner;

public class Entity {
    //Code Simplifiers
    static void clear() {
        System.out.print('\u000C');
    }
    
    //Variables
    public String name;
    public int health;
    public double strength;
    public double defence;
    public String attribute;
    
    //Active Enemy Variables
    public static String activeName;
    public static int activeHealth;
    public static int healthBar;
    public static double activeStrength;
    public static double activeDefence;
    public static String activeAttribute;
    
    //Player Variables
    public static String playerName;
    public static int playerHealth;
    public static int playerHealthBar;
    public static double playerStrength;
    public static double playerDefence;
    public static String playerAttribute;
    
    //Enemy Setting Process
    public void setStatus() {
         activeName = name;
         activeHealth = health;
         healthBar = health;
         activeStrength = strength;
         activeDefence = defence;
         activeAttribute = attribute;
    }
    
    public static void setActive() {
        if (Combat.e == 1) {
            Entity slime = new Entity("Slime", 5, 0.2, 0.2, "Corrosion");
            slime.setStatus();
        }
        
    }
    
    //Parameters
    public Entity(String newName, int newHealth, double newStrength, 
    double newDefence, String newAttribute) {
        name = newName;
        health = newHealth;
        strength = newStrength;
        defence = newDefence;
        attribute = newAttribute;
    }
    
    //Enemy Bank
    void storage() {
        //Entity name = new Entity ("name", health, strength, defence, attribute);
        //Entity player = new Entity("name", ?, ?, ?, "?");
        //^At start make 3 choices of stats available^
        Entity slime = new Entity("Slime", 5, 0.2, 0.2, "Corrosion");
        Entity ghost = new Entity("Ghost", 8, 0.5, 0.2, "Ethereal");
        Entity skeleton = new Entity("Skeleton", 12, 0.3, 0.7, "Tough");
        Entity golem = new Entity("Golem", 20, 0.5, 0.5, "Regeneration");
    }
}
