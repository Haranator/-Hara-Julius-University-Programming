package Java;
/*
 That will replace a specified character with another character.
 Sample Output:
 Original string: The quick brown fox jumps over the lazy dog. 
 New String: The quick brown fox jumps over the lazy fog.
 Filename: MP_String2_GUI.java & MP_String2_Con.jav
*/
import javax.swing.JOptionPane;

public class MP_String2_GUI 
{
    public static void main(String [] args)
    {
        String orig = JOptionPane.showInputDialog("Input string: ");
        
        String rep = JOptionPane.showInputDialog("Enter character to replace: ");

        String sub = JOptionPane.showInputDialog("Enter substitute: ");
        
        for(int i = 0; i < rep.length(); i++)
        {
            orig = orig.replace(rep.charAt(i), sub.charAt(i));
        }
        
        JOptionPane.showMessageDialog(null, "New sentence: " + orig);
    }
}
