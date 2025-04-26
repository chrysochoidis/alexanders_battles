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

        addObject(alexander,938,533);
        Companions companions = new Companions();
        addObject(companions,845,534);
        Companions companions2 = new Companions();
        addObject(companions2,940,472);
        Companions companions3 = new Companions();
        addObject(companions3,848,473);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,251,516);
        Sarissophoroi sarissophoroi2 = new Sarissophoroi();
        addObject(sarissophoroi2,350,511);
        Sarissophoroi sarissophoroi3 = new Sarissophoroi();
        addObject(sarissophoroi3,454,511);
        Sarissophoroi sarissophoroi4 = new Sarissophoroi();
        addObject(sarissophoroi4,557,512);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,698,519);
        Hypaspists hypaspists2 = new Hypaspists();
        addObject(hypaspists2,139,517);
        Darius darius = new Darius();
        addObject(darius,460,92);
        Immortals immortals = new Immortals();
        addObject(immortals,583,94);
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,937,174);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,839,173);
        PersianCavalry persianCavalry3 = new PersianCavalry();
        addObject(persianCavalry3,732,177);
        PersianCavalry persianCavalry4 = new PersianCavalry();
        addObject(persianCavalry4,842,101);
        PersianCavalry persianCavalry5 = new PersianCavalry();
        addObject(persianCavalry5,136,151);
        PersianCavalry persianCavalry6 = new PersianCavalry();
        addObject(persianCavalry6,227,153);
        PersianInfantry persianInfantry = new PersianInfantry();
        addObject(persianInfantry,324,206);
        PersianInfantry persianInfantry2 = new PersianInfantry();
        addObject(persianInfantry2,436,211);
        PersianInfantry persianInfantry3 = new PersianInfantry();
        addObject(persianInfantry3,555,206);
        PersianInfantry persianInfantry4 = new PersianInfantry();
        addObject(persianInfantry4,639,210);
        PersianInfantry persianInfantry5 = new PersianInfantry();
        addObject(persianInfantry5,336,91);
        PersianInfantry persianInfantry6 = new PersianInfantry();
        addObject(persianInfantry6,710,94);
        PersianInfantry persianInfantry7 = new PersianInfantry();
        addObject(persianInfantry7,180,79);

        Tip tip = new Tip();
        addObject(tip, 100, 75);
    }

    public void act(){

        if(battleStatus.equals("playing")){
            checkUnitMovement();
        }
        else if(battleStatus.equals("victory")){
            showText("Νίκησες!!! Κάνε κλικ για την συνέχεια", getWidth()/2, getHeight()/2);
            if(soundPlayed == false){
                Greenfoot.playSound("victory.mp3");
                soundPlayed = true;
            }

            if(Greenfoot.mouseClicked(null)){
                Greenfoot.setWorld(new StoryScreen());
            }
        }
        else if(battleStatus.equals("defeat")){
            showText("Έχασες...", getWidth()/2, getHeight()/2);
            if(soundPlayed == false){
                Greenfoot.playSound("defeat.mp3");
                soundPlayed = true;
            }

            addObject(new ReplayButton(), (getWidth()/2 + 50), (getHeight()/2 + 40));
            addObject(new ReturnToMenuButton(), (getWidth()/2 + 40), (getHeight()/2 + 100));
        }
        checkBattleStatus();
    }

    public void checkBattleStatus(){
        if(alexander.getHealth() <= 0){
            battleStatus = "defeat";
        }

        if(GameStats.persiansKilled >= 15){
            battleStatus = "victory";
        }

        if(GameStats.macedoniansKilled >= 10){
            battleStatus = "defeat";
        }
    }
}
