import greenfoot.*;

/**
 * Creates the Return to Main Menu Button to return to the menu after a battle loss
 */
public class ReturnToMenuButton extends Button
{
    public ReturnToMenuButton(){
       super("ΑΡΧΙΚΟ ΜΕΝΟΥ", 30, 35);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("sword_sound.mp3");
            Greenfoot.setWorld(new MenuScreen());
        }
    }
}
