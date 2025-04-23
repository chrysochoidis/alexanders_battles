import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Button
{
   public BackButton(){
       GreenfootImage img = new GreenfootImage(200, 50);
        img.setColor(Color.BLACK);
        img.setFont(new Font("Arial", true, false, 24));
        img.drawString("BACK", 60, 35);
        setImage(img);
   }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MenuScreen());
        }
    }
}
