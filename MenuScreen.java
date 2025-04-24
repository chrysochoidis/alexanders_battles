import greenfoot.*;

public class MenuScreen extends World
{
    
    public MenuScreen()
    {    
        super(600, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        showText("Welcome to Alexander's Battles!\n Defeat the Persians and write history!",getWidth()/2, 80);
        addObject(new StartButton(), getWidth()/2, (getHeight()/2 - 80));
        addObject(new HowToPlayButton(), getWidth()/2, getHeight()/2);
        addObject(new CreditsButton(), getWidth()/2, (getHeight()/2 + 80));    
        GameStats.level = 0;
    }
}
