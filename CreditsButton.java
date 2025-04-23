import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsButton extends Button
{
    
    public CreditsButton(){
        GreenfootImage img = new GreenfootImage(200, 50);
        img.setColor(new Color(255,215,0));
        img.setFont(new Font("Arial", true, false, 24));
        img.drawString("CREDITS", 60, 35);
        setImage(img);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new CreditsScreen());
        }
    }
}
