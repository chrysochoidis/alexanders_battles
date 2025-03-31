import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Granicus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lv1_Granicus extends World
{
    private BattleUnit selectedUnit;
    /**
     * Constructor for objects of class Granicus.
     * 
     */
    public Lv1_Granicus()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 850, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Alexander alexander = new Alexander();
        addObject(alexander,303,472);
        PersianInfantry persianInfantry = new PersianInfantry();
        addObject(persianInfantry,161,106);
        PersianInfantry persianInfantry2 = new PersianInfantry();
        addObject(persianInfantry2,259,104);
        PersianInfantry persianInfantry3 = new PersianInfantry();
        addObject(persianInfantry3,332,104);
        PersianInfantry persianInfantry4 = new PersianInfantry();
        addObject(persianInfantry4,418,104);
        PersianInfantry persianInfantry5 = new PersianInfantry();
        addObject(persianInfantry5,513,106);
        PersianInfantry persianInfantry6 = new PersianInfantry();
        addObject(persianInfantry6,602,104);
        PersianInfantry persianInfantry7 = new PersianInfantry();
        addObject(persianInfantry7,696,107);
        PersianInfantry persianInfantry8 = new PersianInfantry();
        addObject(persianInfantry8,771,104);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,528,374);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,148,291);
        alexander.setLocation(779,473);
        sarissophoroi.setLocation(228,453);
        Sarissophoroi sarissophoroi2 = new Sarissophoroi();
        addObject(sarissophoroi2,322,454);
        Sarissophoroi sarissophoroi3 = new Sarissophoroi();
        addObject(sarissophoroi3,438,457);
        Sarissophoroi sarissophoroi4 = new Sarissophoroi();
        addObject(sarissophoroi4,574,457);
        hypaspists.setLocation(138,518);
        Hypaspists hypaspists2 = new Hypaspists();
        addObject(hypaspists2,459,541);
        Companions companions = new Companions();
        addObject(companions,710,520);
        Immortals immortals = new Immortals();
        addObject(immortals,319,46);
        Immortals immortals2 = new Immortals();
        addObject(immortals2,524,44);
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,608,182);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,682,188);
        PersianCavalry persianCavalry3 = new PersianCavalry();
        addObject(persianCavalry3,789,182);
        Darius darius = new Darius();
        addObject(darius,634,30);
    }
    
    public void act(){
        if(selectedUnit != null){
            if(Greenfoot.isKeyDown("left")){
                selectedUnit.setRotation(selectedUnit.getRotation() -5);
                if(selectedUnit.getMovingState() == 1){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.3));
                }
            }
            
            if(Greenfoot.isKeyDown("right")){
                selectedUnit.setRotation(selectedUnit.getRotation() + 5);
                if(selectedUnit.getMovingState() == 1){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.3));
                }
            }

              if(Greenfoot.isKeyDown("up")){
                selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.3));
                selectedUnit.setMovingState(1);
            }
            
            if(Greenfoot.isKeyDown("backspace")){
                selectedUnit.stop();
                selectedUnit.setMovingState(0);
            }
    
        }
    }
    
    public void setSelectedUnit(BattleUnit unit){
        selectedUnit = unit;
    }
}
