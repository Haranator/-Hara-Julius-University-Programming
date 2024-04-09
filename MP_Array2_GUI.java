import javax.swing.JOptionPane;

class MP_Array2_GUI
{
    public static void main(String[] args)
    {
        int num[] = new int[3];
        String input;
        StringBuilder format = new StringBuilder();
        StringBuilder format_two = new StringBuilder();

        /* Concatenate the first sentence of the format */
        format.append("The values store into the array are: ");
        format_two.append("The values store into the array in reverse are:");

        /*Gets the in for the elements and appends in the original format */
        for(int i = 1; i<=3; i++)
        {
            input = JOptionPane.showInputDialog("Input Element[" + i + "]: " );
            num[i-1] = Integer.parseInt(input);
            format.append(" " + num[i-1]);
        }

        for (int i = 2; i >= 0; i--) {
            format_two.append(" " + num[i]);
        }
        
        JOptionPane.showMessageDialog(null, format + "\n" + format_two);
    }
}