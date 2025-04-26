import greenfoot.*;  
/**
 * Has the main constuctor for all the buttons.
 */

public class Button extends Actor
{
    public Button(String text, int width, int height){
       GreenfootImage img = new GreenfootImage(300, 50);
       img.setColor(new Color(0,19,222));
       img.setFont(new Font("Comic Sans MS", true, false, 20));
       img.drawString(text, width, height);
       setImage(img);
    }
   
}
