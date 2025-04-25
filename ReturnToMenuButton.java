import greenfoot.*;

/**
 * Creates the Return to Main Menu Button to return to the menu after a battle loss
 */
public class ReturnToMenuButton extends Button
{
    public ReturnToMenuButton(){
        GreenfootImage img = new GreenfootImage(200, 50);
        img.setColor(new Color(255,215,0));
        img.setFont(new Font("Arial", true, false, 24));
        img.drawString("MAIN MENU", 30, 35);
        setImage(img);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MenuScreen());
        }
    }
}
