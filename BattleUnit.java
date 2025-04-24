import greenfoot.*;

/**
 * Write a description of class BattleUnit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class BattleUnit extends SmoothMover
{
    //units specs
    private double speed;
    private int armor;
    private int damage;
    private int health;
    private String faction;
    
    //0: units is still, 1: unit moves forwards, 2: unit moves backwards
    private int movingState;
    
    private boolean fights;
    private int fightTimer = 0;
    private int originalRotation;
    private BattleUnit collidedWith = null;
    
    //images
    private GreenfootImage imgStillHealthy;
    private GreenfootImage imgMovingHealthy;
    private GreenfootImage imgStillMid;
    private GreenfootImage imgMovingMid;
    private GreenfootImage imgStillCritical;
    private GreenfootImage imgMovingCritical;
    /**
     * super constuctor that is called by various battle units
     * depending their own stats
     */
    public BattleUnit(int armor, int damage, int health, String faction){
        this.armor = armor;
        this.damage = damage;
        this.health = health;
        this.movingState = 0;
        this.fights = false;
        this.faction = faction;
    }
    
    /**
     * check for colliding units regardless of faction
     */
    public void checkCollision() {
        BattleUnit other = (BattleUnit)getOneIntersectingObject(BattleUnit.class);
        if (other != null) {
            collide(other);
        }
    }
    
    /**
     * if the units are the same faction they stop.
     * if not the fight sequence begins
     */
    public void collide(BattleUnit other){
        if(this.faction.equals(other.getFaction())){
            this.stop();
            this.setMovingState(0);
            other.stop();
            other.setMovingState(0);
            return;
        }
        if(!fights && !other.fights){
            this.isFighting(other);
            other.isFighting(this);
        }
    }
    /**
     * sets the fighting units's states to fight mode. gets their current 
     * rotation so the fighting sequence be more realistic
     */
    public void isFighting(BattleUnit other){
        fights = true;
        fightTimer = 30;
        originalRotation = getRotation();
        collidedWith = other;
        setMovingState(0);
        stop();
        
    }
    
    /**
     * fighting sequence. in regard to the custom timer the units rotate left 
     * and right to imitate the fighting.
     * one cycle of figting sequence reduces the health of both units
     * if unit health reaches zero it dies and increaces the global 
     * faction death toll counter.
     */
    public void handleFight(){
        World world = getWorld();
        if(fightTimer ==30){
            setRotation(originalRotation - 5);
        }
        else if(fightTimer == 20) {
            setRotation(originalRotation + 10);
        }
        else if (fightTimer == 10){
            setRotation(originalRotation);
        }
        
        fightTimer--;
        
        if (fightTimer <= 0) {
            fightTimer = 30;
            int newHealth = this.getHealth() - Math.max(0, collidedWith.getDamage() - this.getArmor());
            setHealth(newHealth);
                  
            if(getHealth() <=0){
                if(this.getFaction().equals("Persia")){
                    GameStats.incrPersiansKilled();
                }
                if(this.getFaction().equals("Macedonia")){
                    GameStats.incrMacedoniansKilled();
                }
                getWorld().removeObject(this);
                return;
                }
            else{
                    fights = false;
                    collidedWith = null;
                    setRotation(originalRotation);
            }
        }
    }
    
    /**
     * sets the proper image depending the moving and 
     * the health state of the unit
     */
    public void updateImage(int maxHealth){
        GreenfootImage selectedImage;
        if(this.getHealth() > maxHealth * 2/3)
            selectedImage = (movingState == 0) ? imgStillHealthy : imgMovingHealthy;
        else if (this.getHealth() > maxHealth / 3)
            selectedImage = (movingState == 0) ? imgStillMid : imgMovingMid;
        else 
            selectedImage = (movingState == 0) ? imgStillCritical : imgMovingCritical;
        
        setImage(selectedImage);
    }
    public void checkHealthState(){
        
        if (this.getHealth() <= 0){
            
            //World world = getWorld();
            //world.removeObject(this);
           
        }
        
    }
    
    /**
     * check if the battle unit is selected in each level 
     */
    public void checkIfSelected(){
        if(Greenfoot.mouseClicked(this)){
            
            switch(GameStats.level){
                case 1 : Lv1_Granicus granicus = (Lv1_Granicus) getWorld();
                granicus.setSelectedUnit(this);
                break;
                case 2 : Lv2_Issus issus = (Lv2_Issus) getWorld();
                issus.setSelectedUnit(this);
                break;
                case 3 : Lv3_Gaugamela gaugamela = (Lv3_Gaugamela) getWorld();
                gaugamela.setSelectedUnit(this);
                break;
            }
        }
    }
    
    public void loadImages(GreenfootImage stillHealthy, GreenfootImage movingHealthy,
    GreenfootImage stillMid, GreenfootImage movingMid,GreenfootImage stillCritical,
    GreenfootImage movingCritical){
        imgStillHealthy = stillHealthy;
        imgMovingHealthy = movingHealthy;
        imgStillMid = stillMid;
        imgMovingMid = movingMid;
        imgStillCritical = stillCritical;
        imgMovingCritical = movingCritical;

    }
    public int getDamage(){
        return this.damage;
    }
    public  void setDamage(int damage){
        this.damage = damage;
    }
    
     public int getArmor(){
        return this.armor;
    }
    public  void setArmor(int armor){
        this.armor = armor;
    }
    
    public boolean getFightingState(){
        return this.fights;
    }
    public  void setFightingState(boolean m){
        this.fights = m;
    }
    public int getMovingState(){
        return this.movingState;
    }
    public  void setMovingState(int m){
        this.movingState = m;
    }
    
    public int getHealth(){
        return this.health;
    }
    
    public void setHealth(int h){
        this.health = h;
    }
    
    public boolean getFights(){
        return fights;
    }
    
    public String getFaction(){
        return faction;
    }
}
