/**
 * RPG Game in which one explores dungeon layers until they lose
 *
 * @author (JJH)
 * @version (1.0)
 */
import java.util.Scanner;

public class RPG_Defunct
{
    //
    public static Scanner userScan = new Scanner(System.in);
    
    //Clear
    static void clear() {
        System.out.print('\u000C');
    }
    
    //Main program
    public static void main(String[] args) {
        Floor.levelOne();
    }
}