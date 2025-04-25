import greenfoot.*; 

/**
 * Creates the How to Play Button to display the How To Play Screen
 */
public class HowToPlayButton extends Button
{
    public HowToPlayButton(){
        GreenfootImage img = new GreenfootImage(200, 50);
        img.setColor(new Color(255,215,0));
        img.setFont(new Font("Arial", true, false, 24));
        img.drawString("HOW TO PLAY", 30, 35);
        setImage(img);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new HowToPlayScreen());
        }
    }
}
