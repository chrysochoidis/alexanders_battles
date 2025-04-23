import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu_Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends World
{

    /**
     * Constructor for objects of class Menu_Screen.
     * 
     */
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
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
    }
}
