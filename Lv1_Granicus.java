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
    private int timer = 0;
    Tip tip = new Tip();

    public Lv1_Granicus()
    {    
        addObject(alexander,879,516);
        Companions companions = new Companions();
        addObject(companions,786,519);
        Companions companions2 = new Companions();
        addObject(companions2,700,520);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,569,522);
        Sarissophoroi sarissophoroi2 = new Sarissophoroi();
        addObject(sarissophoroi2,455,523);
        Sarissophoroi sarissophoroi3 = new Sarissophoroi();
        addObject(sarissophoroi3,341,527);
        Sarissophoroi sarissophoroi4 = new Sarissophoroi();
        addObject(sarissophoroi4,222,523);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,97,525);
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,898,144);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,783,132);
        PersianCavalry persianCavalry3 = new PersianCavalry();
        addObject(persianCavalry3,663,129);
        PersianCavalry persianCavalry4 = new PersianCavalry();
        addObject(persianCavalry4,545,131);
        PersianCavalry persianCavalry5 = new PersianCavalry();
        addObject(persianCavalry5,393,150);
        PersianCavalry persianCavalry6 = new PersianCavalry();
        addObject(persianCavalry6,260,167);
        PersianInfantry persianInfantry = new PersianInfantry();
        addObject(persianInfantry,781,37);
        PersianInfantry persianInfantry2 = new PersianInfantry();
        addObject(persianInfantry2,651,47);
        PersianInfantry persianInfantry3 = new PersianInfantry();
        addObject(persianInfantry3,518,43);
        PersianInfantry persianInfantry4 = new PersianInfantry();
        addObject(persianInfantry4,379,52);
        PersianInfantry persianInfantry5 = new PersianInfantry();
        addObject(persianInfantry5,269,49);
        
        addObject(tip, 100, 75);
        playBattleSound();
    }

    public void act(){
        if(battleStatus.equals("playing")){
            checkUnitMovement();
        }
        else if(battleStatus.equals("victory")){
            stopBattleSound();
            showText("Νίκησες!!! Κάνε κλικ για την συνέχεια", getWidth()/2, getHeight()/2);
            if(soundPlayed == false){
                playVictorySound();
                soundPlayed = true;
            }

            if(Greenfoot.mouseClicked(null)){
                Greenfoot.setWorld(new StoryScreen());
            }
        }
        else if(battleStatus.equals("defeat")){
            stopBattleSound();
            showText("Έχασες...", getWidth()/2, getHeight()/2);
            if(soundPlayed == false){
                playDefeatSound();
                soundPlayed = true;
            }

            addObject(new ReplayButton(), (getWidth()/2 + 50), (getHeight()/2 + 40));
            addObject(new ReturnToMenuButton(), (getWidth()/2 + 40), (getHeight()/2 + 100));
        }
        timer++;
        checkBattleStatus();
        checkTipTimer();
    }

    /**
     * checking the status of the battle depending the situation
     */
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
    
    /**
     * sets the tip to be displayed for a certain time
     */
    public void checkTipTimer(){
        if(timer >= 1000){
            this.removeObject(tip);
        }
    }
    
}
