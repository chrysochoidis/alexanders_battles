import greenfoot.*;
import java.util.*;
/**
 * The battle map of the third level, representing the battle of Gaugamela.
 * Creates the map, and sets the victory and defeat conditions
 */
public class Lv3_Gaugamela extends Level
{
    private String battleStatus = "playing";
    private boolean soundPlayed = false;
    //tip variables
    private int timer = 0;
    Tip tip = new Tip(); 
    //units variables
    Alexander alexander = new Alexander();

    //persians 1

    private ArrayList<BattleUnit> persians = new ArrayList<BattleUnit>();

    //persians 2
    private Darius darius = new Darius();
    private Immortals immortals = new Immortals();
    private Immortals immortals2 = new Immortals();
    private Immortals immortals3 = new Immortals();
    private PersianInfantry persianInfantry = new PersianInfantry();
    private PersianInfantry persianInfantry2 = new PersianInfantry();
    private PersianCavalry persianCavalry = new PersianCavalry();
    private PersianCavalry persianCavalry2 = new PersianCavalry();
    private PersianInfantry persianInfantry3 = new PersianInfantry();
    private ArrayList<BattleUnit> persians2 = new ArrayList<BattleUnit>();

    public Lv3_Gaugamela()
    {    
        GameStats.resetKills();
        GameStats.level = 3;
        playBattleSound();
        
        //macedonias
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
        
        //persians2
        addObject(darius,488,30);
        addObject(immortals,383,30);
        addObject(immortals2,265,33);
        addObject(immortals3,605,31);
        addObject(persianInfantry,161,33);
        addObject(persianInfantry2,723,34);
        addObject(persianCavalry,932,40);
        addObject(persianCavalry2,827,42);
        addObject(persianInfantry3,65,32);
        persians2.add(immortals);
        persians2.add(immortals2);
        persians2.add(immortals3);
        persians2.add(persianInfantry);
        persians2.add(persianInfantry2);
        persians2.add(persianCavalry);
        persians2.add(persianCavalry2);
        persians2.add(persianInfantry3);
        
        addObject(tip, 100, 75);
        prepare();
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

            addObject(new ReplayButton(), (getWidth()/2+ 50), (getHeight()/2 + 40));
            addObject(new ReturnToMenuButton(), (getWidth()/2 + 40), (getHeight()/2 + 100));
        }

        timer++;
        checkBattleStatus();
        checkTipTimer();
        persianMovement();
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

    public void checkTipTimer(){
        if(timer >= 1000){
            this.removeObject(tip);
        }
    }

    public void persianMovement(){
        for(BattleUnit b : persians){
            if(timer<4500){
                b.newMovement(new Vector(b.getRotation()+90,0.05));
                b.setMovingState(2);
            }
            else{
                b.stop();
                b.setMovingState(0); 
            }
        }

        for(BattleUnit b : persians2){
            if(timer<=1000){
                b.newMovement(new Vector(b.getRotation()+90,0.05));
                b.setMovingState(2);
            }
            else{
                b.stop();
                b.setMovingState(0);
            }
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
      
    }
}
