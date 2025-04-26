import greenfoot.*; 

/**
 * Superclass of all the Battle maps. Handles the unit movements and has sound methods
 */
public class Level extends World
{
    //common variables for all worlds
    private BattleUnit selectedUnit;
    private GreenfootSound battleSound = new GreenfootSound("battle.mp3");
    private GreenfootSound victorySound = new GreenfootSound("victory.mp3");
    private GreenfootSound defeatSound = new GreenfootSound("defeat.mp3");
    
    public Level()
    {    
        super(1000, 600, 1); 
    }
    
    /**
     * Depending the arrow key that the user presses, sets the movement of the 
     * selected unit.Uses the Vector Class
     */
    public void checkUnitMovement(){
        if(selectedUnit != null){
            if(Greenfoot.isKeyDown("left")){
                selectedUnit.setRotation(selectedUnit.getRotation() -1);
                if(selectedUnit.getMovingState() == 1){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.2));
                }
                else if(selectedUnit.getMovingState() == 2){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()+90,0.05));
                }
            }
            
            if(Greenfoot.isKeyDown("right")){
                selectedUnit.setRotation(selectedUnit.getRotation() + 1);
                if(selectedUnit.getMovingState() == 1){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.2));
                }
                else if(selectedUnit.getMovingState() == 2){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()+90,0.05));
                }
            }

              if(Greenfoot.isKeyDown("up")){
                selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.2 ));
                selectedUnit.setMovingState(1);
            }
            
            if(Greenfoot.isKeyDown("down")){
                selectedUnit.newMovement(new Vector(selectedUnit.getRotation()+90,0.05));
                selectedUnit.setMovingState(2);
            }
            if(Greenfoot.isKeyDown("backspace")){
                selectedUnit.stop();
                selectedUnit.setMovingState(0);
            }
        }
    }
        
    public void playBattleSound(){
        battleSound.play();
    }
    
    public void stopBattleSound(){
        battleSound.stop();
    }
    
    public void playDefeatSound(){
        defeatSound.play();
    }
    
    public void playVictorySound(){
        victorySound.play();
    }
    
     public void setSelectedUnit(BattleUnit unit){
        selectedUnit = unit;
    }
}
