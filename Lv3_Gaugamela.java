import greenfoot.*;
/**
 * The battle map of the third level, representing the battle of Gaugamela.
 * Creates the map, and sets the victory and defeat conditions
 */
public class Lv3_Gaugamela extends Level
{
    private String battleStatus = "playing";
    private boolean soundPlayed = false;
    Alexander alexander = new Alexander();
    Darius darius = new Darius();

    public Lv3_Gaugamela()
    {    
        GameStats.resetKills();
        GameStats.level = 3;
        
        addObject(darius,464,63);
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,949,91);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,857,92);
        PersianCavalry persianCavalry3 = new PersianCavalry();
        addObject(persianCavalry3,774,92);
        PersianCavalry persianCavalry4 = new PersianCavalry();
        addObject(persianCavalry4,683,93);
        Immortals immortals = new Immortals();
        addObject(immortals,679,21);
        Immortals immortals2 = new Immortals();
        addObject(immortals2,793,27);
        Immortals immortals3 = new Immortals();
        addObject(immortals3,920,26);
        Immortals immortals4 = new Immortals();
        addObject(immortals4,362,50);
        Immortals immortals5 = new Immortals();
        addObject(immortals5,262,50);
        Immortals immortals6 = new Immortals();
        addObject(immortals6,573,61);
        PersianInfantry persianInfantry = new PersianInfantry();
        addObject(persianInfantry,587,142);
        PersianInfantry persianInfantry2 = new PersianInfantry();
        addObject(persianInfantry2,485,147);
        PersianInfantry persianInfantry3 = new PersianInfantry();
        addObject(persianInfantry3,380,149);
        PersianInfantry persianInfantry4 = new PersianInfantry();
        addObject(persianInfantry4,294,148);
        PersianInfantry persianInfantry5 = new PersianInfantry();
        addObject(persianInfantry5,209,148);
        PersianInfantry persianInfantry6 = new PersianInfantry();
        addObject(persianInfantry6,118,150);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,108,500);
        Sarissophoroi sarissophoroi2 = new Sarissophoroi();
        addObject(sarissophoroi2,206,501);
        Sarissophoroi sarissophoroi3 = new Sarissophoroi();
        addObject(sarissophoroi3,302,501);
        Sarissophoroi sarissophoroi4 = new Sarissophoroi();
        addObject(sarissophoroi4,411,499);
        Sarissophoroi sarissophoroi5 = new Sarissophoroi();
        addObject(sarissophoroi5,512,499);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,800,484);
        Hypaspists hypaspists2 = new Hypaspists();
        addObject(hypaspists2,905,483);
        Companions companions = new Companions();
        addObject(companions,712,491);
        Companions companions2 = new Companions();
        addObject(companions2,717,561);
        Companions companions3 = new Companions();
        addObject(companions3,814,560);
        addObject(alexander,628,501);
        PersianInfantry persianInfantry7 = new PersianInfantry();
        addObject(persianInfantry7,162,18);
        PersianInfantry persianInfantry8 = new PersianInfantry();
        addObject(persianInfantry8,66,19);
        
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
                Greenfoot.playSound("defeat.mp3");;
                soundPlayed = true;
            }

            addObject(new ReplayButton(), (getWidth()/2+ 50), (getHeight()/2 + 40));
            addObject(new ReturnToMenuButton(), (getWidth()/2 + 40), (getHeight()/2 + 100));
        }
        checkBattleStatus();
    }

    public void checkBattleStatus(){

        if(alexander.getHealth() <= 0){
            battleStatus = "defeat";
        }

        if(darius.getHealth() <= 0){
            battleStatus = "victory";
        }

        if(GameStats.persiansKilled >= 22){
            battleStatus = "victory";
        }

        if(GameStats.macedoniansKilled >= 13){
            battleStatus = "defeat";
        }
    }
}
