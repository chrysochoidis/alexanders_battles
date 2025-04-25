import greenfoot.*;  

/**
 * Creates the Info Button to display the InfoScreen
 */
public class InfoButton extends Button
{
    public InfoButton(){
        GreenfootImage img = new GreenfootImage(300, 50);
        img.setColor(new Color(255,215,0));
        img.setFont(new Font("Arial", true, false, 24));
        img.drawString("ΠΛΗΡΟΦΟΡΙΕΣ", 60, 35);
        setImage(img);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("sword_sound.mp3");
            Greenfoot.setWorld(new InfoScreen());
        }
    }
}
