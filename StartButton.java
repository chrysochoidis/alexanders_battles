import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Button
{
    
    public StartButton(){
        GreenfootImage img = new GreenfootImage(200, 50);
        img.setColor(new Color(255,215,0));
        img.setFont(new Font("Arial", true, false, 24));
        img.drawString("START GAME", 30, 35);
        setImage(img);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            switch(GameStats.level){
                case 0 : Greenfoot.setWorld(new StoryScreen());
                break;
                case 1 : Greenfoot.setWorld(new Lv1_Granicus());
                break;
                case 2 : Greenfoot.setWorld(new Lv2_Issus());
                break;
                case 3 : Greenfoot.setWorld(new Lv3_Gaugamela());
                break;
            }
            
        }
    }
}
