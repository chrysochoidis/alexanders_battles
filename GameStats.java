/**
 * Class that has public variables important to the game
 */
public class GameStats  
{
 public static int persiansKilled = 0;
 public static int macedoniansKilled = 0;
 public static int level = 0;
 
 public static void resetKills(){
     persiansKilled = 0;
     macedoniansKilled = 0;
 }
 
 public static void incrPersiansKilled(){
     persiansKilled ++;
 }
 
 public static void incrMacedoniansKilled(){
     macedoniansKilled ++;
 }
 
 
}
