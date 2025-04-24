import greenfoot.*; 

public class Sarissophoroi extends BattleUnit
{
    public Sarissophoroi(){
        super(5,8,60,"Macedonia");
        loadImages(new GreenfootImage("sarissophoroi0_S.png"), new GreenfootImage("sarissophoroi0_M.png"),
        new GreenfootImage("sarissophoroi1_S.png"), new GreenfootImage("sarissophoroi1_M.png"),
        new GreenfootImage("sarissophoroi2_S.png"), new GreenfootImage("sarissophoroi2_M.png"));
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
            updateImage(60);
        }
    }
}
