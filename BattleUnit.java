import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    
    public BattleUnit(int speed, int armor, int damage, int health, String faction){
        this.speed = speed;
        this.armor = armor;
        this.damage = damage;
        this.health = health;
        this.movingState = 0;
        this.fights = false;
        this.faction = faction;
    }
    
    public void checkCollision() {
        BattleUnit other = (BattleUnit)getOneIntersectingObject(BattleUnit.class);
        if (other != null) {
            collide(other);
        }
    }
    
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
    
    public void isFighting(BattleUnit other){
        fights = true;
        fightTimer = 30;
        originalRotation = getRotation();
        collidedWith = other;
        setMovingState(0);
        stop();
        
    }
    
    public void handleFight(){
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
    
    public void checkHealthState(){
        
        if (this.getHealth() < 0){
            World world = getWorld();
            
            world.removeObject(this);
        }
        
    }
    
    public void checkIfSelected(){
        if(Greenfoot.mouseClicked(this)){
            Lv1_Granicus world = (Lv1_Granicus) getWorld();
            world.setSelectedUnit(this);
        }
        
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
