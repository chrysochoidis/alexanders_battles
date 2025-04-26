import greenfoot.*;

/**
 * Screen that shows some information about the game
 */
public class InfoScreen extends Screen
{
    public InfoScreen()
    {    
        showText("Το 'Alexander's Battles' αποτελεί παιχνίδι σοβαρού σκοπού\n" + 
        "που υλοποιήθηκε στα πλαίσια εργασίας του μαθήματος\n" +
        "'Σχεδίαση και Ανάπτυξη Παιχνιδιών Σοβαρού Σκοπού'\n" +
        "του ΠΜΣ Εφαρμοσμένης Πληροφορικής\n" +
        "του Πανεπιστημίου Μακεδονίας\n" +
        "κατα το ακαδημαικό έτος 2024-2025.\n" +
        "Διδάσκων Καθηγητής : Ξυνόγαλος Στυλιανός\n" +
        "Φοιτητής : Χρυσοχοίδης Αναστάσιος\n" ,getWidth()/2, getHeight()/3);
        addObject(new BackButton(), (getWidth()/2 + 80), (getHeight()/2 + 200));
    }
}
