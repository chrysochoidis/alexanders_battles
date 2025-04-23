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
        super(1000, 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Alexander alexander = new Alexander();
        addObject(alexander,885,561);
        Companions companions = new Companions();
        addObject(companions,790,562);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,152,564);
        Sarissophoroi sarissophoroi2 = new Sarissophoroi();
        addObject(sarissophoroi2,242,559);
        sarissophoroi2.setLocation(261,557);
        Sarissophoroi sarissophoroi3 = new Sarissophoroi();
        addObject(sarissophoroi3,336,555);
        Sarissophoroi sarissophoroi4 = new Sarissophoroi();
        addObject(sarissophoroi4,450,564);
        sarissophoroi3.setLocation(376,556);
        sarissophoroi4.setLocation(486,552);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,629,556);
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,931,186);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,803,154);
        PersianCavalry persianCavalry3 = new PersianCavalry();
        addObject(persianCavalry3,635,151);
        PersianCavalry persianCavalry4 = new PersianCavalry();
        addObject(persianCavalry4,472,150);
        PersianCavalry persianCavalry5 = new PersianCavalry();
        addObject(persianCavalry5,308,162);
        PersianCavalry persianCavalry6 = new PersianCavalry();
        addObject(persianCavalry6,155,174);
        PersianInfantry persianInfantry = new PersianInfantry();
        addObject(persianInfantry,734,49);
        PersianInfantry persianInfantry2 = new PersianInfantry();
        addObject(persianInfantry2,555,64);
        PersianInfantry persianInfantry3 = new PersianInfantry();
        addObject(persianInfantry3,393,58);
        PersianInfantry persianInfantry4 = new PersianInfantry();
        addObject(persianInfantry4,236,63);
        Companions companions2 = new Companions();
        addObject(companions2,699,633);
        hypaspists.setLocation(583,609);
        companions2.setLocation(676,560);
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
