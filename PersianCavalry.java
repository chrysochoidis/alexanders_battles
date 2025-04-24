import greenfoot.*;

public class PersianCavalry extends BattleUnit
{
    public PersianCavalry(){
        super(4,7,75,"Persia");
        loadImages(new GreenfootImage("persianCav0_S.png"), new GreenfootImage("persianCav0_M.png"),
        new GreenfootImage("persianCav1_S.png"), new GreenfootImage("persianCav1_M.png"),
        new GreenfootImage("persianCav2_S.png"), new GreenfootImage("persianCav2_M.png"));
    }

    public void act()
    {
         if(this.getFights()){
            handleFight();
        }
        else{
            move();
            checkCollision();
            checkHealthState();
            updateImage(75);
        }     
    }
}
