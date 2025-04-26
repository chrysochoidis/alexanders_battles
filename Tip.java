import greenfoot.*;

public class Tip extends Actor {
    

    public Tip() {
        GreenfootImage tip = null;
        
        switch(GameStats.level){
            
            case 1 :   tip = new GreenfootImage("tip_granicus.png");
            break;
            case 2 :   tip = new GreenfootImage("tip_issus.png");
            break;
            case 3 :  tip = new GreenfootImage("tip_gaugamela.png");
            break;
        }
        
        if(tip != null){
            setImage(tip);
        }
    }
}
