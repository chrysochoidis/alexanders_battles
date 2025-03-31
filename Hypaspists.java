import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hypaspists here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hypaspists extends BattleUnit
{
    private GreenfootImage image = new GreenfootImage("hypaspists0_S.png");
    private GreenfootImage image1 = new GreenfootImage("hypaspists0_M.png");
    
    public Hypaspists(){
        super(1,7,6,300);
    }
    /**
     * Act - do whatever the Hypaspists wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        checkIfSelected();
        //checkHealthState();
        checkMovingState();
    }
    
    public void checkIfSelected(){
        if(Greenfoot.mouseClicked(this)){
            Lv1_Granicus world = (Lv1_Granicus) getWorld();
            world.setSelectedUnit(this);
        }
        
    }
    
      public void checkMovingState(){
        if(this.getMovingState() == 0){
            setImage(image);
        }
        else if (this.getMovingState() == 1){
            setImage(image1);
        }
    }
}
