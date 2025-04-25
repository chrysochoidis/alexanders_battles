import greenfoot.*;
/**
 * Screen that displayes the Main Menu with some choices.
 * It sets the game level to 0
 */
public class MenuScreen extends Screen
{
    public MenuScreen()
    {    
        showText("Καλωσήρθατε στο Alexander's Battles!\n Νίκησε τους Πέρσες και γράψε ιστορία!",getWidth()/2, getHeight()/6);
        addObject(new StartButton(), (getWidth()/2 + 80), (getHeight()/2 - 60));
        addObject(new HowToPlayButton(), getWidth()/2, getHeight()/2);
        addObject(new InfoButton(), getWidth()/2, (getHeight()/2 + 60));    
        GameStats.level = 0;
    }
    
}
