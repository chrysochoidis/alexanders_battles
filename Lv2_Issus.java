import greenfoot.*;

/**
 * The battle map of the second level, representing the Battle of Issus.
 * Creates the map, and sets the victory and defeat conditions.
 */
public class Lv2_Issus extends Level
{
    private String battleStatus = "playing";
    private boolean soundPlayed = false;
    private Alexander alexander = new Alexander();
    
    public Lv2_Issus()
    {     
        GameStats.resetKills();
        GameStats.level = 2;
        
        addObject(alexander,903,588);
        Companions companions = new Companions();
        addObject(companions,822,588);
        Companions companions2 = new Companions();
        addObject(companions2,913,662);
        Companions companions3 = new Companions();
        addObject(companions3,826,658);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,295,636);
        Sarissophoroi sarissophoroi2 = new Sarissophoroi();
        addObject(sarissophoroi2,202,634);
        Sarissophoroi sarissophoroi3 = new Sarissophoroi();
        addObject(sarissophoroi3,484,636);
        Sarissophoroi sarissophoroi4 = new Sarissophoroi();
        addObject(sarissophoroi4,393,636);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,598,634);
        Hypaspists hypaspists2 = new Hypaspists();
        addObject(hypaspists2,704,629);
        Darius darius = new Darius();
        addObject(darius,582,119);
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,308,146);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,212,147);
        PersianInfantry persianInfantry = new PersianInfantry();
        addObject(persianInfantry,656,233);
        PersianInfantry persianInfantry2 = new PersianInfantry();
        addObject(persianInfantry2,545,232);
        PersianInfantry persianInfantry3 = new PersianInfantry();
        addObject(persianInfantry3,437,232);
        PersianInfantry persianInfantry4 = new PersianInfantry();
        addObject(persianInfantry4,344,234);
        PersianInfantry persianInfantry5 = new PersianInfantry();
        addObject(persianInfantry5,750,234);
        PersianInfantry persianInfantry6 = new PersianInfantry();
        addObject(persianInfantry6,740,132);
        PersianInfantry persianInfantry7 = new PersianInfantry();
        addObject(persianInfantry7,436,127);
        PersianCavalry persianCavalry3 = new PersianCavalry();
        addObject(persianCavalry3,240,225);
        PersianCavalry persianCavalry4 = new PersianCavalry();
        addObject(persianCavalry4,142,227);
        Immortals immortals = new Immortals();
        addObject(immortals,480,51);
        Immortals immortals2 = new Immortals();
        addObject(immortals2,668,59);
        PersianCavalry persianCavalry5 = new PersianCavalry();
        addObject(persianCavalry5,927,224);
        PersianCavalry persianCavalry6 = new PersianCavalry();
        addObject(persianCavalry6,848,183);
    }
    
     public void act(){
         
         if(battleStatus.equals("playing")){
            checkUnitMovement();
        }
        else if(battleStatus.equals("victory")){
            showText("Victory!! Click to continue", getWidth()/2, getHeight()/2);
            if(soundPlayed == false){
                Greenfoot.playSound("victory.mp3");
                soundPlayed = true;
            }
            
            if(Greenfoot.mouseClicked(null)){
                Greenfoot.setWorld(new StoryScreen());
            }
        }
        else if(battleStatus.equals("defeat")){
            showText("Defeat...Click to return to Main Menu", getWidth()/2, getHeight()/2);
            if(soundPlayed == false){
                Greenfoot.playSound("defeat.mp3");
                soundPlayed = true;
            }

            addObject(new ReplayButton(), getWidth()/2, (getHeight()/2 + 20));
            addObject(new ReturnToMenuButton(), getWidth()/2, (getHeight()/2 + 100));
        }
        checkBattleStatus();
    }
    
    public void checkBattleStatus(){
        if(alexander.getHealth() <= 0){
            battleStatus = "defeat";
        }
        
        if(GameStats.persiansKilled >= 1){
            battleStatus = "victory";
        }
        
        if(GameStats.macedoniansKilled >= 10){
            battleStatus = "defeat";
        }
    }
}
