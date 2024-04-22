package Java;
import javax.swing.JOptionPane;

public class MP_Array6_GUI {
    public static void main(String[] args)
    {
        int n, insert, position;

        String in = JOptionPane.showInputDialog("Input the size of the array: ");
        n = Integer.parseInt(in);
        // The array
        int num[] = new int[n];

        JOptionPane.showMessageDialog(null,"Input " + n + " elements in the array in ascending order");
        for(int i = 0; i < n; i++ )
        {
            String in_elem = JOptionPane.showInputDialog("Input element[" + (i+1) +"]: ");
            num[i] = Integer.parseInt(in_elem);
        }

        String in_value = JOptionPane.showInputDialog("Input the value to be inserted: ");
        insert = Integer.parseInt(in_value);

        String in_pos = JOptionPane.showInputDialog("Input the position, where the value should be inserted: ");
        position = Integer.parseInt(in_pos) - 1;

        String curr_arr = "The current list of the array:";
        for(int i = 0; i < n; i++)
        {
            curr_arr += " " + num[i];
        }

        JOptionPane.showMessageDialog(null, curr_arr);

        int elem_new = n + 1;
        //new array
        int second[] = new int[elem_new];

        String next_arr = "After the insert, the array list is:";
        for(int i = 0, j = 0; i < elem_new; i++)
        {
            if(i == position)
            {
                second[position] = insert;
            }
            else
            {
                second[i] = num[j];
                j++;
            }
        }
        for(int i = 0; i < elem_new; i++)
        {
            next_arr += " " + second[i];
        }
        JOptionPane.showMessageDialog(null, next_arr);

    }    
}