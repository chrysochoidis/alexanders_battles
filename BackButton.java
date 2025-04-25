import greenfoot.*; 

/**
 * Creates a button that represents the "Back" functionality in the main menu.
 */
public class BackButton extends Button
{
   public BackButton(){
        GreenfootImage img = new GreenfootImage(300, 50);
        img.setColor(Color.BLACK);
        img.setFont(new Font("Arial", true, false, 24));
        img.drawString("ΠΙΣΩ", 60, 35);
        setImage(img);
   }
   
   public void act(){
       if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("sword_sound.mp3");
            Greenfoot.setWorld(new MenuScreen());
        }
   }
}
