import greenfoot.*; 

/**
 * Creates a button that represents the "Back" functionality in the main menu.
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
   
   public void act(){
       if(Greenfoot.mouseClicked(this)){
                Greenfoot.setWorld(new MenuScreen());
            }
   }
}
