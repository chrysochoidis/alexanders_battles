import greenfoot.*;
/**
 * Class representing the Hypaspists. Creates a battle unit with 
 * certain specs and loads its images
 */
public class Hypaspists extends BattleUnit
{
    public Hypaspists(){
        super(6,6,130,"Macedonia");
        loadImages(new GreenfootImage("hypaspists0_S.png"), new GreenfootImage("hypaspists0_M.png"),
        new GreenfootImage("hypaspists1_S.png"), new GreenfootImage("hypaspists1_M.png"),
        new GreenfootImage("hypaspists2_S.png"), new GreenfootImage("hypaspists2_M.png"));
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
            updateImage(65);
       
        }
    }
}
