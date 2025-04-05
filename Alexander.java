import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alexander here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alexander extends BattleUnit
{


    private GreenfootImage image = new GreenfootImage("alexander0_S.png");
    private GreenfootImage image1 = new GreenfootImage("alexander0_M.png");

    public Alexander(){
        super(2,5,10,120,"Macedonia"); 
    }
    /**
     * Act - do whatever the Alexander wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(this.getFights()){
            handleFight();
            checkIfSelected();
        }
        else{
        move();
        checkIfSelected();
        checkCollision();
        checkHealthState();
        checkMovingState();

    }
        
    }

    public void checkMovingState(){
        if(this.getMovingState() == 0){
            setImage(image);
        }
        else if (this.getMovingState() == 1 || this.getMovingState() == 2){
            setImage(image1);
        }
    }
    
    
    
    
    
    
}
