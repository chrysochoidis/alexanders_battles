import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlayScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlayScreen extends World
{

    /**
     * Constructor for objects of class HowToPlayScreen.
     * 
     */
    public HowToPlayScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1);
        prepare();
    }
    
    private void prepare(){
        showText("Your goal is to defeat the Persian army in every battle.\n" +
        "Select each unit individually by clicking on it.\n" +
        "Up Arrow - unit moves forward\n" +
        "Down Arrow - unit moves backwards\n" +
        "Left Arrow - unit rotates left\n" +
        "Right Arrow - unit rotates right\n"+
        "Backspace - unit halts" ,getWidth()/2, getHeight()/2);
        addObject(new BackButton(), getWidth()/2, (getHeight()/2 + 200));
    }
}
