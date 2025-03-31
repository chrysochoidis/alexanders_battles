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
        addObject(alexander,765,640);
        Darius darius = new Darius();
        addObject(darius,503,75);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,344,669);
        Hypaspists hypaspists2 = new Hypaspists();
        addObject(hypaspists2,456,669);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,325,571);
        Sarissophoroi sarissophoroi2 = new Sarissophoroi();
        addObject(sarissophoroi2,480,564);
        Sarissophoroi sarissophoroi3 = new Sarissophoroi();
        addObject(sarissophoroi3,491,568);
        Sarissophoroi sarissophoroi4 = new Sarissophoroi();
        addObject(sarissophoroi4,617,569);
        Sarissophoroi sarissophoroi5 = new Sarissophoroi();
        addObject(sarissophoroi5,756,564);
        sarissophoroi2.setLocation(250,568);
        sarissophoroi2.setLocation(412,556);
        sarissophoroi.setLocation(346,559);
        sarissophoroi2.setLocation(445,566);
        sarissophoroi.setLocation(346,564);
        sarissophoroi4.setLocation(560,563);
        sarissophoroi5.setLocation(657,559);
        hypaspists.setLocation(189,637);
        hypaspists2.setLocation(661,646);
        alexander.setLocation(812,611);
        Companions companions = new Companions();
        addObject(companions,937,637);
        PersianInfantry persianInfantry = new PersianInfantry();
        addObject(persianInfantry,798,172);
        PersianInfantry persianInfantry2 = new PersianInfantry();
        addObject(persianInfantry2,650,170);
        PersianInfantry persianInfantry3 = new PersianInfantry();
        addObject(persianInfantry3,511,171);
        PersianInfantry persianInfantry4 = new PersianInfantry();
        addObject(persianInfantry4,412,175);
        PersianInfantry persianInfantry5 = new PersianInfantry();
        addObject(persianInfantry5,301,177);
        PersianInfantry persianInfantry6 = new PersianInfantry();
        addObject(persianInfantry6,181,184);
        PersianInfantry persianInfantry7 = new PersianInfantry();
        addObject(persianInfantry7,74,177);
        PersianInfantry persianInfantry8 = new PersianInfantry();
        addObject(persianInfantry8,107,255);
        PersianInfantry persianInfantry9 = new PersianInfantry();
        addObject(persianInfantry9,265,247);
        PersianInfantry persianInfantry10 = new PersianInfantry();
        addObject(persianInfantry10,399,235);
        PersianInfantry persianInfantry11 = new PersianInfantry();
        addObject(persianInfantry11,557,236);
        PersianInfantry persianInfantry12 = new PersianInfantry();
        addObject(persianInfantry12,729,227);
        PersianInfantry persianInfantry13 = new PersianInfantry();
        addObject(persianInfantry13,860,239);
        Immortals immortals = new Immortals();
        addObject(immortals,671,83);
        Immortals immortals2 = new Immortals();
        addObject(immortals2,262,82);
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,886,70);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,783,79);
        PersianCavalry persianCavalry3 = new PersianCavalry();
        addObject(persianCavalry3,898,136);
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
