import greenfoot.*;
import java.util.*;

/**
 * The battle map of the second level, representing the Battle of Issus.
 * Creates the map, and sets the victory and defeat conditions.
 * Makes some persian movement
 */
public class Lv2_Issus extends Level
{
    private String battleStatus = "playing";
    private boolean soundPlayed = false;
    
    //tip variables
    private int timer = 0;
    Tip tip = new Tip();
    //unit variables
    private Alexander alexander = new Alexander();
    //persians 1
    private PersianCavalry persianCavalry = new PersianCavalry();
    private PersianCavalry persianCavalry2 = new PersianCavalry();
    private PersianCavalry persianCavalry3 = new PersianCavalry(); 
    private PersianInfantry persianInfantry = new PersianInfantry();  
    private PersianInfantry persianInfantry2 = new PersianInfantry(); 
    private PersianInfantry persianInfantry3 = new PersianInfantry(); 
    private PersianInfantry persianInfantry4 = new PersianInfantry(); 
    private PersianInfantry persianInfantry5 = new PersianInfantry(); 
    private ArrayList<BattleUnit> persians = new ArrayList<BattleUnit>();
    
    //persians 2
    private Darius darius = new Darius();
    private Immortals immortals = new Immortals();
    private PersianCavalry persianCavalry4 = new PersianCavalry();
    private PersianCavalry persianCavalry5 = new PersianCavalry();
    private PersianCavalry persianCavalry6 = new PersianCavalry();
    private PersianCavalry persianCavalry7 = new PersianCavalry();
    private PersianInfantry persianInfantry6 = new PersianInfantry();
    private PersianInfantry persianInfantry7 = new PersianInfantry();
    private ArrayList<BattleUnit> persians2 = new ArrayList<BattleUnit>();

    public Lv2_Issus()
    {     
        GameStats.resetKills();
        GameStats.level = 2;
        playBattleSound();
                
        //macedonians
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
        
        //persians 1
        addObject(persianInfantry,698,78);
        addObject(persianInfantry2,570,81);
        addObject(persianInfantry3,443,85);
        addObject(persianInfantry4,345,84);
        addObject(persianInfantry5,245,88);
        addObject(persianCavalry,947,87);
        addObject(persianCavalry2,838,90);
        addObject(persianCavalry3,127,84);
      
        persians.add(persianCavalry);
        persians.add(persianCavalry2);
        persians.add(persianCavalry3);
        persians.add(persianInfantry);
        persians.add(persianInfantry2);
        persians.add(persianInfantry3);
        persians.add(persianInfantry4);
        persians.add(persianInfantry5);
        
        //persians 2
        addObject(darius,513,18);
        addObject(immortals,619,20);
        addObject(persianCavalry4,768,19);
        addObject(persianCavalry5,874,25);
        addObject(persianCavalry6,957,23);
        addObject(persianCavalry7,129,22);
        addObject(persianInfantry6,231,14);
        addObject(persianInfantry7,382,22);
        
        persians2.add(darius);
        persians2.add(immortals);
        persians2.add(persianCavalry4);
        persians2.add(persianCavalry5);
        persians2.add(persianCavalry6);
        persians2.add(persianCavalry7);
        persians2.add(persianInfantry6);
        persians2.add(persianInfantry7);
        
        addObject(tip, 100, 75);
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
        persianMovement();
    }

     /**
     * checking the status of the battle depending the situation
     */
    public void checkBattleStatus(){
        if(alexander.getHealth() <= 0){
            battleStatus = "defeat";
        }

        if(GameStats.persiansKilled >= 16){
            battleStatus = "victory";
        }

        if(GameStats.macedoniansKilled >= 10){
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
    
    /**
     * dummy movement for some persian units, depending their role
     */
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
            if(timer<=2000){
                b.newMovement(new Vector(b.getRotation()+90,0.05));
                b.setMovingState(2);
            }
            else{
                b.stop();
                b.setMovingState(0);
            }
        }
    }
}
