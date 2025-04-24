import greenfoot.*;

public class MenuScreen extends Screen
{
    
    public MenuScreen()
    {    
        showText("Welcome to Alexander's Battles!\n Defeat the Persians and write history!",getWidth()/2, 80);
        addObject(new StartButton(), getWidth()/2, (getHeight()/2 - 80));
        addObject(new HowToPlayButton(), getWidth()/2, getHeight()/2);
        addObject(new CreditsButton(), getWidth()/2, (getHeight()/2 + 80));    
        GameStats.level = 0;
    }
}
