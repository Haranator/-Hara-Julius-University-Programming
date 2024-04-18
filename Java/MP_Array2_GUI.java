package Java;
import javax.swing.JOptionPane;

class MP_Array2_GUI
{
    public static void main(String[] args)
    {
        String n_put, input;
        StringBuilder format = new StringBuilder();
        StringBuilder format_two = new StringBuilder();
        int n;

        /* Concatenate the first sentence of the format */
        format.append("The values store into the array are: ");
        format_two.append("The values store into the array in reverse are:");

        n_put = JOptionPane.showInputDialog("Input the number of elements to store in the array: ");
        n = Integer.parseInt(n_put);

        /*The array */
        int num[] = new int[n];
        String message = "Input " + n + " numbers in the element array\n";
        
        /*Gets the in for the elements and appends in the original format */
        for(int i = 1; i<= n; i++)
        {
            input = JOptionPane.showInputDialog(message + "Input Element[" + i + "]:" );
            num[i-1] = Integer.parseInt(input);
            format.append(" " + num[i-1]);
        }

        for (int i = n-1; i >= 0; i--) {
            format_two.append(" " + num[i]);
        }
        
        JOptionPane.showMessageDialog(null, format + "\n" + format_two);
    }
}