import greenfoot.*;

/**
 * The battle map of the first level, representing the Battle of river Granicus.
 * Creates the map, and sets the victory and defeat conditions.
 */
public class Lv1_Granicus extends Level
{
    private String battleStatus = "playing";
    private boolean soundPlayed = false;
    private Alexander alexander = new Alexander();

    public Lv1_Granicus()
    {    
        addObject(alexander,882,576);
        Companions companions = new Companions();
        addObject(companions,788,614);
        Companions companions2 = new Companions();
        addObject(companions2,679,605);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,519,598);
        Sarissophoroi sarissophoroi2 = new Sarissophoroi();
        addObject(sarissophoroi2,420,598);
        Sarissophoroi sarissophoroi3 = new Sarissophoroi();
        addObject(sarissophoroi3,308,598);
        Sarissophoroi sarissophoroi4 = new Sarissophoroi();
        addObject(sarissophoroi4,191,598);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,591,667);
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,900,160);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,774,162);
        PersianCavalry persianCavalry3 = new PersianCavalry();
        addObject(persianCavalry3,662,160);
        PersianCavalry persianCavalry4 = new PersianCavalry();
        addObject(persianCavalry4,526,178);
        PersianCavalry persianCavalry5 = new PersianCavalry();
        addObject(persianCavalry5,385,182);
        PersianCavalry persianCavalry6 = new PersianCavalry();
        addObject(persianCavalry6,219,215);
        PersianInfantry persianInfantry = new PersianInfantry();
        addObject(persianInfantry,738,34);
        PersianInfantry persianInfantry2 = new PersianInfantry();
        addObject(persianInfantry2,608,38);
        PersianInfantry persianInfantry3 = new PersianInfantry();
        addObject(persianInfantry3,458,42);
        PersianInfantry persianInfantry4 = new PersianInfantry();
        addObject(persianInfantry4,323,44);
        PersianInfantry persianInfantry5 = new PersianInfantry();
        addObject(persianInfantry5,182,51);
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
        
        if(GameStats.persiansKilled >= 11){
            battleStatus = "victory";            
        }
        
        if(GameStats.macedoniansKilled >= 8){
            battleStatus = "defeat";
        }
    }
}
