import greenfoot.*; 

/**
 * Creates the How to Play Button to display the How To Play Screen
 */
public class HowToPlayButton extends Button
{
    public HowToPlayButton(){
        super("ΟΔΗΓΙΕΣ ΠΑΙΧΝΙΔΙΟΥ", 30, 35);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("sword_sound.mp3");
            Greenfoot.setWorld(new HowToPlayScreen());
        }
    }
}
