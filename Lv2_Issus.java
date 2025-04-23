import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Granicus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lv2_Issus extends World
{

    /**
     * Constructor for objects of class Granicus.
     * 
     */
    public Lv2_Issus()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PersianCavalry persianCavalry = new PersianCavalry();
        addObject(persianCavalry,223,187);
        PersianCavalry persianCavalry2 = new PersianCavalry();
        addObject(persianCavalry2,332,190);
        PersianInfantry persianInfantry = new PersianInfantry();
        addObject(persianInfantry,453,193);
        PersianInfantry persianInfantry2 = new PersianInfantry();
        addObject(persianInfantry2,540,198);
        PersianInfantry persianInfantry3 = new PersianInfantry();
        addObject(persianInfantry3,652,194);
        PersianInfantry persianInfantry4 = new PersianInfantry();
        addObject(persianInfantry4,760,195);
        PersianInfantry persianInfantry5 = new PersianInfantry();
        addObject(persianInfantry5,862,193);
        PersianInfantry persianInfantry6 = new PersianInfantry();
        addObject(persianInfantry6,459,109);
        PersianInfantry persianInfantry7 = new PersianInfantry();
        addObject(persianInfantry7,645,114);
        PersianInfantry persianInfantry8 = new PersianInfantry();
        addObject(persianInfantry8,782,118);
        PersianInfantry persianInfantry9 = new PersianInfantry();
        addObject(persianInfantry9,893,113);
        PersianInfantry persianInfantry10 = new PersianInfantry();
        addObject(persianInfantry10,323,110);
        Darius darius = new Darius();
        addObject(darius,549,116);
        Immortals immortals = new Immortals();
        addObject(immortals,202,94);
        Immortals immortals2 = new Immortals();
        addObject(immortals2,879,52);
        Immortals immortals3 = new Immortals();
        addObject(immortals3,716,43);
        Alexander alexander = new Alexander();
        addObject(alexander,917,503);
        Companions companions = new Companions();
        addObject(companions,831,507);
        Sarissophoroi sarissophoroi = new Sarissophoroi();
        addObject(sarissophoroi,341,500);
        Sarissophoroi sarissophoroi2 = new Sarissophoroi();
        addObject(sarissophoroi2,471,604);
        Sarissophoroi sarissophoroi3 = new Sarissophoroi();
        addObject(sarissophoroi3,581,606);
        Sarissophoroi sarissophoroi4 = new Sarissophoroi();
        addObject(sarissophoroi4,690,602);
        sarissophoroi.setLocation(365,582);
        sarissophoroi.setLocation(374,577);
        removeObject(sarissophoroi);
        addObject(sarissophoroi,335,607);
        Companions companions2 = new Companions();
        addObject(companions2,188,588);
        Hypaspists hypaspists = new Hypaspists();
        addObject(hypaspists,781,649);
        Hypaspists hypaspists2 = new Hypaspists();
        addObject(hypaspists2,649,657);
        Hypaspists hypaspists3 = new Hypaspists();
        addObject(hypaspists3,469,670);
        Companions companions3 = new Companions();
        addObject(companions3,851,574);
    }
}
