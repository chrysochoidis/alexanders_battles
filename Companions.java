import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Companions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Companions extends BattleUnit
{
    private GreenfootImage image = new GreenfootImage("companion0_S.png");
    private GreenfootImage image1 = new GreenfootImage("companion0_M.png");    
      public Companions(){
        super(2,4,7,80,"Macedonia");
    }
    /**
     * Act - do whatever the Companions wants to do. This method is called whenever
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
