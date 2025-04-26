import greenfoot.*; 

/**
 * Creates the Replay Button, to replay a certain level.
 */
public class ReplayButton extends Button
{
    public ReplayButton(){
       super("ΞΑΝΑΠΑΙΞΕ",30, 35);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            World battleMap = new Level();
            switch(GameStats.level){
                case 1 : battleMap  = new Lv1_Granicus();
                break;
                case 2 : battleMap = new Lv2_Issus();
                break;
                case 3 :battleMap = new Lv3_Gaugamela();
                break;
            }
            Greenfoot.playSound("sword_clash.mp3");
            GameStats.resetKills();
            Greenfoot.setWorld(battleMap);
        }
    }
}
