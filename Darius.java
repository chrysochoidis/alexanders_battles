import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Darius here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Darius extends BattleUnit
{
    private GreenfootImage image = new GreenfootImage("darius0_S.png");
    private GreenfootImage image1 = new GreenfootImage("darius0_M.png");
    public Darius(){
        super(2,2,9,110,"Persia");
    }
    /**
     * Act - do whatever the Darius wants to do. This method is called whenever
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
}
