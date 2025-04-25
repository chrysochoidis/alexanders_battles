import greenfoot.*; 

/**
 * Creates the How to Play Button to display the How To Play Screen
 */
public class HowToPlayButton extends Button
{
    public HowToPlayButton(){
        GreenfootImage img = new GreenfootImage(300, 50);
        img.setColor(new Color(255,215,0));
        img.setFont(new Font("Arial", true, false, 24));
        img.drawString("ΟΔΗΓΙΕΣ ΠΑΙΧΝΙΔΙΟΥ", 30, 35);
        setImage(img);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("sword_sound.mp3");
            Greenfoot.setWorld(new HowToPlayScreen());
        }
    }
}
