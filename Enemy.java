/**
 * Enemy Object List
 *
 * @author (JJH)
 * @version (1.0)
 */
import java.util.Scanner;

public class Enemy
{
    //
    public static Scanner userScan = new Scanner(System.in);
    
    //Clear
    static void clear() {
        System.out.print('\u000C');
    }
    
    //Rules
    static void rules() {
        String rules = "yes";
        //Expand the rule into separate while statements for individual statements
        while (rules.equals("yes")) {
            System.out.println("Enemy Guide Book 0.1");
            System.out.println("By JJ Hartog");
            System.out.println("-----------------------------------------------");            
            System.out.println("Basics:");
            System.out.print("This Program contains the basic types of "); 
            System.out.println("enemies for the RPG Game");
            System.out.println("-----------------------------------------------");
            System.out.println("To continue input [start]");
            rules = userScan.next();
        }
    }
    
    //Enemy Type Variables
    
    String name;
    //Enemy Name
    int health;
    //Maximum Health an enemy can have 
    //(later add a variance to it like 5 up or below)
    double strength;
    //Strength multiplication factor on attacks
    //(Base Damage) x (Strength) x (Player Defence) = Actual damage
    double defence;
    //Defence multiplication factor on defence
    //(Base Damage) x (Player Strength) x (Defence) = Actual damage
    String attribute;
    //Misc. Attribute types which have specialized effects with a if else program
    //Slimes have "Corrosion" which deals more damage for the longer a battle lasts
    
    //Parameters for Enemy Object
    public Enemy(String newName, int newHealth, double newStrength, 
    double newDefence, String newAttribute) {
        name = newName;
        health = newHealth;
        strength = newStrength;
        defence = newDefence;
        attribute = newAttribute;
    }
    
    
    public String newName() {
        return name;
    }
    
    public int newHealth() {
        return health;
    }
    
    public double newStrength() {
        return strength;
    }
    
    public double newDefence() {
        return defence;
    }
    
    public String newAttribute() {
        return attribute;
    }
    
    //Activating Enemies (Currently Nulled)
    static void activationEnemies() {
        Enemy slime = new Enemy("Slime", 5, 0.2, 0.2, "Corrosion");
        //Corrosion deals more damages as the turn counter ticks up
        Enemy ghost = new Enemy("Ghost", 8, 0.5, 0.2, "Ethereal");
        //Ethereal ignores Player Defence
        Enemy skeleton = new Enemy("Skeleton", 12, 0.3, 0.7, "Tough");
        //Tough halves the damage taken by Player Attacks
        Enemy golem = new Enemy("Golem", 20, 0.5, 0.5, "Regeneration");
        //Regeneration heals 1-4 health points per turn
    }
    
    //Print List
    public void printEnemy() {
        String cont = "yes";
        while (cont.equals("yes")) {
            System.out.println("Enemy Stat Card:");
            System.out.println("Name:                " + name);
            System.out.println("Health Pre-Variance: " + health);
            System.out.println("Strength:            " + strength);
            System.out.println("Defence:             " + defence);
            System.out.println("Attribute:           " + attribute);
            System.out.println();
            System.out.println("Enter to Continue");
            cont = userScan.next();
        }
    }
    
    static void explain(){
        String cont = "yes";
        while (cont.equals("yes")) {
            System.out.println("Enemy Stat Card Definitions:");
            System.out.println("Name: ");
            System.out.println("Enemy's name");
            System.out.println("Health Pre-Variance: ");
            System.out.println("Maximum Health an enemy can have"); 
            System.out.println("(This is excluding a variance of ~5 hp)");
            System.out.println("Strength:");
            System.out.println("(Base Damage) x (Strength) x (Player Defence) = Actual damage");
            System.out.println("Defence:");
            System.out.println("(Base Damage) x (Player Strength) x (Defence) = Actual damage");
            System.out.println("Attributes: ");
            System.out.println("Enter to Continue");
            cont = userScan.next();
        }
        clear();
        cont = "yes";
        while (cont.equals("yes")) {
            System.out.println("Attribute Definitions:");
            System.out.println("Corrosion: ");
            System.out.println("Deals more damages as the turn counter ticks up");
            System.out.println("Ethereal: "); 
            System.out.println("Attacks ignore Player Defence");
            System.out.println("Tough: ");
            System.out.println("Halves the damage taken by Player Attacks");
            System.out.println("Regeneration: ");
            System.out.println("Heals 1-4 health points per turn");
            System.out.println("");
            System.out.println("Enter to Continue");
            cont = userScan.next();
        }
        clear();
    }
    
    //Main program [Swap to a public static void]
    public static void main(String[] args) {
        explain();
        
        Enemy slime = new Enemy("Slime", 5, 0.2, 0.2, "Corrosion");
        slime.printEnemy();
        Enemy ghost = new Enemy("Ghost", 8, 0.5, 0.2, "Ethereal");
        ghost.printEnemy();
        Enemy skeleton = new Enemy("Skeleton", 12, 0.3, 0.7, "Tough");
        skeleton.printEnemy();
        Enemy golem = new Enemy("Golem", 20, 0.5, 0.5, "Regeneration");
        golem.printEnemy();
    }
}
