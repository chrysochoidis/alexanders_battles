import greenfoot.*;

public class Lv3_Gaugamela extends World
{
    private BattleUnit selectedUnit;
    private String battleStatus = "playing";
    private boolean soundPlayed = false;
    
    public Lv3_Gaugamela()
    {    
        super(1000, 700, 1); 
        prepare();
    }
    
    private void prepare()
    {
        GameStats.reset();
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
                Greenfoot.setWorld(new MenuScreen());
            }
        }
        else if(battleStatus.equals("defeat")){
            showText("Defeat...Click to return to Main Menu", getWidth()/2, getHeight()/2);
            if(soundPlayed == false){
                Greenfoot.playSound("defeat.mp3");;
                soundPlayed = true;
            }

            if(Greenfoot.mouseClicked(null)){
                Greenfoot.setWorld(new MenuScreen());
            }
        }
        checkBattleStatus();
    }
    
    public void checkUnitMovement(){
        if(selectedUnit != null){
            if(Greenfoot.isKeyDown("left")){
                selectedUnit.setRotation(selectedUnit.getRotation() -5);
                if(selectedUnit.getMovingState() == 1){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.3));
                }
                else if(selectedUnit.getMovingState() == 2){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()+90,0.1));
                }
            }
            
            if(Greenfoot.isKeyDown("right")){
                selectedUnit.setRotation(selectedUnit.getRotation() + 5);
                if(selectedUnit.getMovingState() == 1){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.3));
                }
                else if(selectedUnit.getMovingState() == 2){
                    selectedUnit.newMovement(new Vector(selectedUnit.getRotation()+90,0.1));
                }
            }

              if(Greenfoot.isKeyDown("up")){
                selectedUnit.newMovement(new Vector(selectedUnit.getRotation()-90,0.3 ));
                selectedUnit.setMovingState(1);
            }
            
            if(Greenfoot.isKeyDown("down")){
                selectedUnit.newMovement(new Vector(selectedUnit.getRotation()+90,0.1));
                selectedUnit.setMovingState(2);
            }
            if(Greenfoot.isKeyDown("backspace")){
                selectedUnit.stop();
                selectedUnit.setMovingState(0);
            }
        }
    }
    
    public void checkBattleStatus(){
        if(GameStats.persiansKilled >= 12){
            battleStatus = "victory";
        }
        if(GameStats.macedoniansKilled >= 8){
            battleStatus = "defeat";
        }
    }
    
    public void setSelectedUnit(BattleUnit unit){
        selectedUnit = unit;
    }

}
