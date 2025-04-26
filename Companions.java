import greenfoot.*;
/**
 * Class representing the Companion Cavalry. Creates a battle unit with 
 * certain specs and loads its images
 */
public class Companions extends BattleUnit
{
      public Companions(){
        super(4,7,160,"Macedonia");
        loadImages(new GreenfootImage("companion0_S.png"), new GreenfootImage("companion0_M.png"),
        new GreenfootImage("companion1_S.png"), new GreenfootImage("companion1_M.png"),
        new GreenfootImage("companion2_S.png"), new GreenfootImage("companion2_M.png"));
    }

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
        updateImage(80);
        }
    }
}
