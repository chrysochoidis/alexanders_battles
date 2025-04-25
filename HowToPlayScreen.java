import greenfoot.*;  

/**
 * Screen that shows the game controllers
 */
public class HowToPlayScreen extends Screen
{
    public HowToPlayScreen()
    {    
        showText("Στόχος σου είναι να νικήσεις τους Πέρσες σε όλες τις μάχες.\n" +
        "Επέλεξε κάθε μονάδα χωριστά κάνονταςν πάνω της κλικ.\n" +
        "Επάνω βέλος - η μονάδα κινείται προς τα ΕΜΠΡΟΣ\n" +
        "Κάτω βέλος - η μονάδα κινείται προς τα ΠΙΣΩ\n" +
        "Αριστερό βέλος - η μονάδα περιστρέφεται προς τα ΑΡΙΣΤΕΡΑ\n" +
        "Δεξί βέλος - η μονάδα περιστρέφεται προς τα ΔΕΞΙΑ\n"+
        "Backspace - η μονάδα ακινητοποιείται\n" +
        "ΠΡΟΣΟΧΗ! Αν πεθάνει ο Αλέξανδρος τότε αυτόματα χάνεται η μάχη" ,getWidth()/2, getHeight()/2);
        addObject(new BackButton(), (getWidth()/2 + 50), (getHeight()/2 + 200));
    }
}
