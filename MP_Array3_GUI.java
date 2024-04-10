import javax.swing.JOptionPane;

class MP_Array3_GUI
{
    public static void main(String [] args)
    {
        int number=0;
        String input, text;
        try
        {
            String array_in = JOptionPane.showInputDialog("Input the number of elements to be stored in the array: ");
            int n = Integer.parseInt(array_in);
    
            int num[] = new int[n];
    
            for(int i = 1; i <= n; i++)
            {
                text = "Input " + n + " elements in the array\n";
                input = JOptionPane.showInputDialog( text + "Input element[" + i + "]: ");
                num[i-1] = Integer.parseInt(input);
                number += num[i-1];
            }

            JOptionPane.showMessageDialog(null, "Sum of all elements stored in the array is: " + number);
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

    }
}