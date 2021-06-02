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
    
    static void Pauser() {
        while (cont.equals("yes")) {
            System.out.println("(Enter Anything to Continue)");
            cont = userScan.next();
        }
        cont = "yes";
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
            System.out.println("Player Attack Options:");
            System.out.println("[Zap]");
            System.out.println("[Firebolt]");
            System.out.println("[Slash]");
            System.out.println("[Crush]");
            System.out.println("--------------------");
        }
        String attack = userScan.next();
        double damage = 0;
        double actualDamage;
        if (Entity.activeName.equals("Slime")) {
            if (attack.equals("Zap") || attack.equals("[Zap]")) {
                System.out.println("Electricity zips across the slime's surface");
                System.out.println("The attack is super effective");
                damage = 3;
            }
            else if (attack.equals("Firebolt") || attack.equals("[Firebolt]")) {
                System.out.println("The firebolt dissipates on contact with the slime");
                System.out.println("The attack is not very effective");
                damage = 1.5;
            }
            else if (attack.equals("Slash") || attack.equals("[Slash]")) {
                System.out.println("A portion of the slime is sliced off");
                System.out.println("The attack is effective");
                damage = 2;
            }
            else if (attack.equals("Crush") || attack.equals("[Crush]")) {
                System.out.println("The slime simply rebounds after attack");
                System.out.println("The attack is not very effective");
                damage = 1;
            }
        }
        Pauser();
        actualDamage = damage * Entity.playerStrength / Entity.activeDefence;
        int intDamage = (int) actualDamage;
        System.out.println("Slime takes " + intDamage + " damage");
        int computation = Entity.healthBar;
        Entity.healthBar = computation - intDamage;
        Pauser();
        clear();
    }
    
    //Enemy Turn
    static void enemyTurn() {
        inter();
        double damage = 0;
        double actualDamage;
        if (Entity.activeName.equals("Slime")) {
            int f = (int)(Math.random() * (2 - 1 + 1) + 1);
            if (f == 1) {
                System.out.println("The slime [Bashes] you");
                damage = 10;
            }
            else if (f == 2) {
                System.out.println("The slime [corrodes] you");
                damage = 20;
            }
        }
        actualDamage = damage * Entity.activeStrength / Entity.playerDefence;
        int intDamage = (int) actualDamage;
        System.out.println("You take " + intDamage + " damage");
        int computation = Entity.playerHealth;
        Entity.playerHealth = computation - intDamage;
        Pauser();
        clear();
    }
    
    static void gameOver() {
        inter();
        if (Entity.activeName.equals("Slime")) {
            System.out.println("You are dissolved by the slime until nothing remains");
            System.out.println("GAME OVER");
            System.out.println("please quit the program");
        }
    }
    
    
    public static void start() {
        randomActivation();
        while (Entity.healthBar > 0) {
            playerTurn();
            enemyTurn();
            t++;
            if (Entity.playerHealth < 0) {
                gameOver();
            }
        }
        System.out.println("The slime deforms into a puddle");
    }
}