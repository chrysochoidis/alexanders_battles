import greenfoot.*; 

public class Darius extends BattleUnit
{
    public Darius(){
        super(2,9,110,"Persia");
        loadImages(new GreenfootImage("darius0_S.png"), new GreenfootImage("darius0_M.png"),
        new GreenfootImage("darius1_S.png"), new GreenfootImage("darius1_M.png"),
        new GreenfootImage("darius2_S.png"), new GreenfootImage("darius2_M.png"));
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
            updateImage(110);
        }  
    }
}
