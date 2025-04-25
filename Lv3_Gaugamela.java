import greenfoot.*;
/**
 * The battle map of the third level, representing the battle of Gaugamela.
 * Creates the map, and sets the victory and defeat conditions
 */
public class Lv3_Gaugamela extends Level
{
    private String battleStatus = "playing";
    private boolean soundPlayed = false;
    Alexander alexander = new Alexander();
    Darius darius = new Darius();
    
    public Lv3_Gaugamela()
    {    
        prepare();
    }
    
    private void prepare()
    {
        GameStats.resetKills();
        GameStats.level = 3;
    }
    
    public void act(){
       if(battleStatus.equals("playing")){
            checkUnitMovement();
        }
        else if(battleStatus.equals("victory")){
            showText("Victory!! Click to return to Main Menu", getWidth()/2, getHeight()/2);
            if(soundPlayed == false){
                Greenfoot.playSound("victory.mp3");
                soundPlayed = true;
            }
            
            if(Greenfoot.mouseClicked(null)){
                Greenfoot.setWorld(new StoryScreen());
            }
        }
        else if(battleStatus.equals("defeat")){
            showText("Defeat...Click to return to Main Menu", getWidth()/2, getHeight()/2);
            if(soundPlayed == false){
                Greenfoot.playSound("defeat.mp3");;
                soundPlayed = true;
            }

            addObject(new ReplayButton(), getWidth()/2, (getHeight()/2 + 20));
            addObject(new ReturnToMenuButton(), getWidth()/2, (getHeight()/2 + 100));
        }
        checkBattleStatus();
    }
    
    public void checkBattleStatus(){
        
        if(alexander.getHealth() <= 0){
            battleStatus = "defeat";
        }
        
        if(darius.getHealth() <= 0){
            battleStatus = "victory";
        }
        
        if(GameStats.persiansKilled >= 1){
            battleStatus = "victory";
        }
        
        if(GameStats.macedoniansKilled >= 10){
            battleStatus = "defeat";
        }
    }
}
