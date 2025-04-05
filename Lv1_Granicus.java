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
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,235,200);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,364,207);
        PersianCavalry persianCavalry3 = new PersianCavalry();
        addObject(persianCavalry3,497,203);
        PersianCavalry persianCavalry4 = new PersianCavalry();
        addObject(persianCavalry4,619,198);
        PersianCavalry persianCavalry5 = new PersianCavalry();
        addObject(persianCavalry5,758,202);
        PersianCavalry persianCavalry6 = new PersianCavalry();
        addObject(persianCavalry6,886,200);
        PersianInfantry persianInfantry = new PersianInfantry();
        addObject(persianInfantry,308,88);
        PersianInfantry persianInfantry2 = new PersianInfantry();
        addObject(persianInfantry2,462,95);
        PersianInfantry persianInfantry3 = new PersianInfantry();
        addObject(persianInfantry3,644,93);
        PersianInfantry persianInfantry4 = new PersianInfantry();
        addObject(persianInfantry4,792,90);
        Alexander alexander = new Alexander();
        addObject(alexander,857,558);
        Companions companions = new Companions();
        addObject(companions,757,561);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,560,545);
        Sarissophoroi sarissophoroi2 = new Sarissophoroi();
        addObject(sarissophoroi2,445,547);
        Sarissophoroi sarissophoroi3 = new Sarissophoroi();
        addObject(sarissophoroi3,326,548);
        Sarissophoroi sarissophoroi4 = new Sarissophoroi();
        addObject(sarissophoroi4,216,549);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,110,573);
        Hypaspists hypaspists2 = new Hypaspists();
        addObject(hypaspists2,639,623);
        PersianCavalry persianCavalry7 = new PersianCavalry();
        addObject(persianCavalry7,111,201);
    }
    
    public void act(){
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
    
    public void setSelectedUnit(BattleUnit unit){
        selectedUnit = unit;
    }
}
