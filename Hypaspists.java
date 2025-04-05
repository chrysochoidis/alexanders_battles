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
        super(1,6,6,65,"Macedonia");
    }
    /**
     * Act - do whatever the Hypaspists wants to do. This method is called whenever
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
