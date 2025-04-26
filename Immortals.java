import greenfoot.*;
/**
 * Class representing Persian Immortals. Creates a battle unit with 
 * certain specs and loads its images
 */
public class Immortals extends BattleUnit
{
    public Immortals(){
        super(7,8,200,"Persia");
        loadImages(new GreenfootImage("immortals0_S.png"), new GreenfootImage("immortals0_M.png"),
        new GreenfootImage("immortals1_S.png"), new GreenfootImage("immortals1_M.png"),
        new GreenfootImage("immortals2_S.png"), new GreenfootImage("immortals2_M.png"));
    }

    public void act()
    {
        if(this.getFights()){
            handleFight();
        }
        else{
            move();
            checkCollision();
            updateImage(100);        
        }      
    }
}
