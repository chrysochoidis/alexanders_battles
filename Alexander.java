import greenfoot.*;
/**
 * Class representing Alexander the Great. Creates a battle unit with 
 * certain specs and loads its images
 */
public class Alexander extends BattleUnit
{
    public Alexander(){
        super(5,10,120,"Macedonia");
        loadImages(new GreenfootImage("alexander0_S.png"), new GreenfootImage("alexander0_M.png"),
        new GreenfootImage("alexander1_S.png"), new GreenfootImage("alexander1_M.png"),
        new GreenfootImage("alexander2_S.png"), new GreenfootImage("alexander2_M.png"));
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
            updateImage(120);
        }
    }
}
