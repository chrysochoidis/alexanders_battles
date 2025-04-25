import greenfoot.*; 

/**
 * Creates the Replay Button, to replay a certain level.
 */
public class ReplayButton extends Button
{
    public ReplayButton(){
        GreenfootImage img = new GreenfootImage(200, 50);
        img.setColor(new Color(255,215,0));
        img.setFont(new Font("Arial", true, false, 24));
        img.drawString("REPLAY", 30, 35);
        setImage(img);
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
            GameStats.resetKills();
            Greenfoot.setWorld(battleMap);
        }
    }
}
