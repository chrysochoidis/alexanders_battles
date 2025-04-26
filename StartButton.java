import greenfoot.*;

/**
 * Creates the Start button to initiate the game or the battle.
 */
public class StartButton extends Button
{
    public StartButton(){
       super("ΕΝΑΡΞΗ", 30, 35);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("sword_clash.mp3");
            switch(GameStats.level){
                case 0 : Greenfoot.setWorld(new StoryScreen());
                break;
                case 1 : Greenfoot.setWorld(new Lv1_Granicus());
                break;
                case 2 : Greenfoot.setWorld(new Lv2_Issus());
                break;
                case 3 : Greenfoot.setWorld(new Lv3_Gaugamela());
                break;
            }
        }
    }
}
