import greenfoot.*;  

/**
 * Creates the Info Button to display the InfoScreen
 */
public class InfoButton extends Button
{
    public InfoButton(){
        super("ΠΛΗΡΟΦΟΡΙΕΣ", 60, 35);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("sword_sound.mp3");
            Greenfoot.setWorld(new InfoScreen());
        }
    }
}
