import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lv2_Issus extends World
{
    private BattleUnit selectedUnit;
    private String battleStatus = "playing";
    private boolean soundPlayed = false;
    
    public Lv2_Issus()
    {    
        super(1000, 700, 1); 
        prepare();
    }

    private void prepare()
    {
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,223,187);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,332,190);
        PersianInfantry persianInfantry = new PersianInfantry();
        addObject(persianInfantry,453,193);
        PersianInfantry persianInfantry2 = new PersianInfantry();
        addObject(persianInfantry2,540,198);
        PersianInfantry persianInfantry3 = new PersianInfantry();
        addObject(persianInfantry3,652,194);
        PersianInfantry persianInfantry4 = new PersianInfantry();
        addObject(persianInfantry4,760,195);
        PersianInfantry persianInfantry5 = new PersianInfantry();
        addObject(persianInfantry5,862,193);
        PersianInfantry persianInfantry6 = new PersianInfantry();
        addObject(persianInfantry6,459,109);
        PersianInfantry persianInfantry7 = new PersianInfantry();
        addObject(persianInfantry7,645,114);
        PersianInfantry persianInfantry8 = new PersianInfantry();
        addObject(persianInfantry8,782,118);
        PersianInfantry persianInfantry9 = new PersianInfantry();
        addObject(persianInfantry9,893,113);
        PersianInfantry persianInfantry10 = new PersianInfantry();
        addObject(persianInfantry10,323,110);
        Darius darius = new Darius();
        addObject(darius,549,116);
        Immortals immortals = new Immortals();
        addObject(immortals,202,94);
        Immortals immortals2 = new Immortals();
        addObject(immortals2,879,52);
        Immortals immortals3 = new Immortals();
        addObject(immortals3,716,43);
        Alexander alexander = new Alexander();
        addObject(alexander,917,503);
        Companions companions = new Companions();
        addObject(companions,831,507);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,341,500);
        Sarissophoroi sarissophoroi2 = new Sarissophoroi();
        addObject(sarissophoroi2,471,604);
        Sarissophoroi sarissophoroi3 = new Sarissophoroi();
        addObject(sarissophoroi3,581,606);
        Sarissophoroi sarissophoroi4 = new Sarissophoroi();
        addObject(sarissophoroi4,690,602);
        sarissophoroi.setLocation(365,582);
        sarissophoroi.setLocation(374,577);
        removeObject(sarissophoroi);
        addObject(sarissophoroi,335,607);
        Companions companions2 = new Companions();
        addObject(companions2,188,588);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,781,649);
        Hypaspists hypaspists2 = new Hypaspists();
        addObject(hypaspists2,649,657);
        Hypaspists hypaspists3 = new Hypaspists();
        addObject(hypaspists3,469,670);
        Companions companions3 = new Companions();
        addObject(companions3,851,574);
        GameStats.reset();
        GameStats.level = 2;
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
                Greenfoot.playSound("defeat.mp3");;
                soundPlayed = true;
            }

            if(Greenfoot.mouseClicked(null)){
                Greenfoot.setWorld(new MenuScreen());
            }
        }
        checkBattleStatus();
    }
    
    public void checkUnitMovement(){
        if(selectedUnit != null){
            if(Greenfoot.isKeyDown("left")){
                selectedUnit.setRotation(selectedUnit.getRotation() -5);
                if(selectedUnit.getMovingState() == 1){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.3));
                }
                else if(selectedUnit.getMovingState() == 2){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()+90,0.1));
                }
            }
            
            if(Greenfoot.isKeyDown("right")){
                selectedUnit.setRotation(selectedUnit.getRotation() + 5);
                if(selectedUnit.getMovingState() == 1){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.3));
                }
                else if(selectedUnit.getMovingState() == 2){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()+90,0.1));
                }
            }

              if(Greenfoot.isKeyDown("up")){
                selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.3 ));
                selectedUnit.setMovingState(1);
            }
            
            if(Greenfoot.isKeyDown("down")){
                selectedUnit.newMovement(new Vector(selectedUnit.getRotation()+90,0.1));
                selectedUnit.setMovingState(2);
            }
            if(Greenfoot.isKeyDown("backspace")){
                selectedUnit.stop();
                selectedUnit.setMovingState(0);
            }
        }
    }
    
    public void checkBattleStatus(){
        if(GameStats.persiansKilled >= 12){
            battleStatus = "victory";
        }
        if(GameStats.macedoniansKilled >= 8){
            battleStatus = "defeat";
        }
    }
    
    public void setSelectedUnit(BattleUnit unit){
        selectedUnit = unit;
    }


}
