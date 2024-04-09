import javax.swing.JOptionPane;

public class MP_Array1_GUI {
    public static void main(String[] args)
    {
        int num[] = new int[10];
        String format = "{ ";

        try
        {
            JOptionPane.showMessageDialog(null, "Input 10 elements in this array");
            for(int i = 1; i <= 10; i++)
            {
                String text_input = "Element[" + i + "]: ";
                num[i-1]  = Integer.parseInt(JOptionPane.showInputDialog(text_input));
                format += String.format(Integer.toString(num[i-1]) + " ");
            }

            JOptionPane.showMessageDialog(null, "The elements in the array are: " + format + "}");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
}
