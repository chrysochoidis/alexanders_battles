import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsScreen extends Screen
{


    public CreditsScreen()
    {    
        showText("Το 'Alexander's Battles' αποτελεί παιχνίδι σοβαρού σκοπού\n" + 
         "που υλοποιήθηκε στα πλάισια εργασίας του μαθήματος\n" +
        "'Σχεδίαση και Ανάπτυξη Παιχνιδιών Σοβαρού Σκοπού'\n" +
        "του ΠΜΣ Εφαρμοσμένης Πληροφορικής\n" +
        "του Πανεπιστημίου Μακεδονίας\n" +
        "κατα το ακαδημαικό έτος 2024-2025.\n" +
        "Διδάσκωντας : Ξυνόγαλος Στυλιανός\n" +
        "Φοιτητής : Χρυσοχοιδης Αναστάσιος\n" ,getWidth()/2, getHeight()/2);
        addObject(new BackButton(), getWidth()/2, (getHeight()/2 + 200));
    }
}
