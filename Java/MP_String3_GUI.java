package Java;
/*
 That converts all characters in a string to lowercase.
 Sample Output:
 Original String: The Quick BroWn FoX! 
 String in lowercase: the quick brown fox!
 Filename: MP_String3_GUI.java & MP_String3_Con.java
*/
import javax.swing.JOptionPane;
public class MP_String3_GUI 
{
    public static void main(String [] args)
    {
        String orig = "The Quick BroWn FoX! ";
        String sentence = orig.toLowerCase();
        
        JOptionPane.showMessageDialog(null, "Original String: " + orig + "\nString in Lowercase: " + sentence);
    }
}
