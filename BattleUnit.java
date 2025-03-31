import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BattleUnit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class BattleUnit extends SmoothMover
{
    
    private int speed;
    private int armor;
    private int damage;
    private int health;
    //0: units is still, 1: unit moves
    private int movingState;
    //0: healthy, 1:low damage, 2:heavy damage, 3:routing
    private int healthState;
    
    public BattleUnit(int speed, int armor, int damage, int health){
        this.speed = speed;
        this.armor = armor;
        this.damage = damage;
        this.health = health;
        this.movingState = 0;
        this.healthState = 0;
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
    
    public int getHealthState(){
        return this.healthState;
    }
    
    public void setHealthState(int hs){
        this.healthState = hs;
    }
  
}
