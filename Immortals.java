import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Immortals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Immortals extends BattleUnit

{
    
    private GreenfootImage image = new GreenfootImage("immortals0_S.png");
    private GreenfootImage image1 = new GreenfootImage("immortals0_M.png");
    public Immortals(){
        super(1,7,8,100,"Persia");
    }
    /**
     * Act - do whatever the Immortals wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(this.getFights()){
            handleFight();
        }
        else{
        move();
        checkCollision();
        checkHealthState();
        //checkMovingState();
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
