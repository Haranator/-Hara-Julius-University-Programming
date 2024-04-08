package Java;
import javax.swing.JOptionPane;

class MP_String1_GUI {
    public static void main (String [] args)
    {
        String pr = JOptionPane.showInputDialog("Input string: ");

        int str_length = pr.length();
        JOptionPane.showMessageDialog(null, "The String Lenghth of \"" + pr + "\" is: " + str_length);
    }
}