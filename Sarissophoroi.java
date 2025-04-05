import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sarissophoroi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sarissophoroi extends BattleUnit
{
    private GreenfootImage image = new GreenfootImage("sarissophoroi0_S.png");
    private GreenfootImage image1 = new GreenfootImage("sarissophoroi0_M.png");
    public Sarissophoroi(){
        super(1,5,8,60,"Macedonia");
    }
    /**
     * Act - do whatever the Sarissophoroi wants to do. This method is called whenever
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
