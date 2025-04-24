import greenfoot.*;

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
            checkHealthState();
            updateImage(120);
        }
    }
}
