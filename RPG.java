/**
 * RPG Game in which one explores dungeon layers until they lose
 *
 * @author (JJH)
 * @version (1.0)
 */
import java.util.Scanner;

public class RPG
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
            System.out.println("RPG Game 0.1");
            System.out.println("By JJ Hartog");
            System.out.println("-----------------------------------------------");            
            System.out.println("Rules:");
            System.out.print("This basic frame contains the "); 
            System.out.println("object system for spell book");
            System.out.println("-----------------------------------------------");
            System.out.println("To continue input [start]");
            rules = userScan.next();
        }
    }
    
    //Spells
    //Variables
    String name;
    int activation;
    //time to activate: 0 means instant; # means # of turns
    int lasting;
    //time to last: 0 means no side effect; # means # of turns
    double selfEffect;
    //effect of 0 means it is a special move; other numbers are buffs/debuffs
    double enemyEffect;
    //See above
    String definition;
    //Explanation of Spell
    
    //Parameters for Spells Object
    public RPG(String newName, int newActivation, int newLasting, 
    double newSelfEffect, double newEnemyEffect, String newDefinition) {
        name = newName;
        activation = newActivation;
        lasting = newLasting;
        selfEffect = newSelfEffect;
        enemyEffect = newEnemyEffect;
        definition = newDefinition;
    }
    
    public void setRPG(String newName, int newActivation, int newLasting,
    double newSelfEffect, double newEnemyEffect, String newDefinition) {
        name = newName;
        activation = newActivation;
        lasting = newLasting;
        selfEffect = newSelfEffect;
        enemyEffect = newEnemyEffect;
        definition = newDefinition;
    }
    
    public String newName() {
        return name;
    }
    
    public int newActivation() {
        return activation;
    }
    
    public int newLasting() {
        return lasting;
    }
    
    public double newSelfEffect() {
        return selfEffect;
    }
    
    public double newEnemyEffect() {
        return enemyEffect;
    }
    
    public String newDefinition() {
        return definition;
    }
    /*
    static RPG initializeSpells() {
        
        
        //Zap:
        RPG spell1 = new Spell("
        
        Spell zap = new Spell(inputName, inputActivation, inputlasting, 
        inputSelfEffect, inputEnemyEffect, inputDefintion);
        
        zap.setSpell(inputName, inputActivation, inputlasting, 
        inputSelfEffect, inputEnemyEffect, inputDefintion);
        
        return zap;
    }
    */
    
    //Main program
    public static void main(String[] args) {
        RPG spell1 = new RPG("Harden", 0, 3, 0.5, 0.0, "Temp");
    }
}