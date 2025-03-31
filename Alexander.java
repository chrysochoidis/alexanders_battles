import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alexander here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alexander extends BattleUnit
{
    //0 for healthy, 1 for low damage, 2 for heavy damage, 3 routing
    private int healthState ;
    //0 for still and 1 for moving

    private GreenfootImage image = new GreenfootImage("alexander0_S.png");
    private GreenfootImage image1 = new GreenfootImage("alexander0_M.png");

    public Alexander(){
        super(2,5,8,500); 
    }
    /**
     * Act - do whatever the Alexander wants to do. This method is called whenever
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
    
    public void checkHealthState(){
        
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
