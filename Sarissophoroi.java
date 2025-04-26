import greenfoot.*; 
/**
 * Class representing the Sarissa phalanx. Creates a battle unit with 
 * certain specs and loads its images
 */
public class Sarissophoroi extends BattleUnit
{
    public Sarissophoroi(){
        super(5,8,120,"Macedonia");
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
            updateImage(60);
        }
    }
}
