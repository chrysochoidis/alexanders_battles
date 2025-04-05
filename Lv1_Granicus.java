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
        addObject(alexander,602,550);
        Immortals immortals = new Immortals();
        addObject(immortals,629,191);
        alexander.setLocation(615,306);
        Immortals immortals2 = new Immortals();
        addObject(immortals2,547,191);
        alexander.setLocation(592,307);
        alexander.setLocation(606,287);
        alexander.setLocation(695,379);
        immortals.setLocation(730,203);
        Companions companions = new Companions();
        addObject(companions,447,481);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,614,620);
        removeObject(hypaspists);
        companions.setLocation(546,324);
        Companions companions2 = new Companions();
        addObject(companions2,264,438);
        Companions companions3 = new Companions();
        addObject(companions3,404,441);
        Companions companions4 = new Companions();
        addObject(companions4,132,462);
        Companions companions5 = new Companions();
        addObject(companions5,122,671);
        Companions companions6 = new Companions();
        addObject(companions6,271,635);
        Companions companions7 = new Companions();
        addObject(companions7,453,668);
        alexander.setLocation(700,380);
        Immortals immortals3 = new Immortals();
        addObject(immortals3,852,213);
        Immortals immortals4 = new Immortals();
        addObject(immortals4,344,199);
        Immortals immortals5 = new Immortals();
        addObject(immortals5,199,194);
        removeObject(companions7);
        removeObject(companions6);
        removeObject(companions5);
        removeObject(companions2);
        removeObject(companions3);
        removeObject(companions);
        removeObject(immortals3);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,520,379);
        Hypaspists hypaspists2 = new Hypaspists();
        addObject(hypaspists2,325,385);
        Alexander alexander2 = new Alexander();
        addObject(alexander2,934,87);
        Alexander alexander3 = new Alexander();
        addObject(alexander3,681,75);
        alexander3.setLocation(694,79);
        alexander2.setLocation(883,750);
        sarissophoroi.setLocation(790,741);
        companions4.setLocation(699,745);
        hypaspists2.setLocation(614,760);
        alexander.setLocation(307,390);
        hypaspists2.setLocation(620,736);
        hypaspists2.setLocation(611,730);
        hypaspists2.setLocation(197,365);
        companions4.setLocation(521,354);
        sarissophoroi.setLocation(713,340);
        immortals.setLocation(743,213);
        removeObject(immortals);
        removeObject(immortals2);
        removeObject(immortals4);
        removeObject(immortals5);
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,208,188);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,329,189);
        PersianCavalry persianCavalry3 = new PersianCavalry();
        addObject(persianCavalry3,339,182);
        PersianCavalry persianCavalry4 = new PersianCavalry();
        addObject(persianCavalry4,541,203);
        PersianCavalry persianCavalry5 = new PersianCavalry();
        addObject(persianCavalry5,718,177);
        persianCavalry2.setLocation(467,58);
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
