import greenfoot.*;
/**
 * Class representing the Persian Infantry. Creates a battle unit with 
 * certain specs and loads its images
 */
public class PersianInfantry extends BattleUnit
{
    public PersianInfantry(){
        super(3,5,100,"Persia");
        loadImages(new GreenfootImage("persian_inf0_S.png"), new GreenfootImage("persian_inf0_M.png"),
        new GreenfootImage("persian_inf1_S.png"), new GreenfootImage("persian_inf1_M.png"),
        new GreenfootImage("persian_inf2_S.png"), new GreenfootImage("persian_inf2_M.png"));
    }
    
    public void act()
    {
         if(this.getFights()){
            handleFight();
        }
        else{
        move();
        checkCollision();
        updateImage(55);
        }  
    }
}
