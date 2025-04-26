import greenfoot.*; 

/**
 * Creates a button that represents the "Back" functionality in the main menu.
 */
public class BackButton extends Button
{
   public BackButton(){
        super("ΠΙΣΩ", 30,35);
   }
   
   public void act(){
       if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("sword_sound.mp3");
            Greenfoot.setWorld(new MenuScreen());
        }
   }
}
