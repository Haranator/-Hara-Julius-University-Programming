package Java;
import javax.swing.JOptionPane;

public class MP_Array5_GUI {
    public static void main(String[] args) {
        int n, insert;

        String in = JOptionPane.showInputDialog("Input the size of the array: ");
        n = Integer.parseInt(in);
        // The array
        int num[] = new int[n];

        JOptionPane.showMessageDialog(null, "Input " + n + " elements in the sorted array in ascending order\n");
        for(int i = 0; i < n; i++) {
            String in_elem = JOptionPane.showInputDialog("Input element[" + (i+1) +"]: ");
            num[i] = Integer.parseInt(in_elem);
        }

        String arr_list = "The current list of the array:";
        for(int i = 0; i < n; i++) {
            arr_list += " " + num[i];
        }

        JOptionPane.showMessageDialog(null, arr_list);

        String in_insert = JOptionPane.showInputDialog("Input the value to be inserted: ");
        insert = Integer.parseInt(in_insert);

        int length_arr = n+1;
        int second[] = new int[length_arr];
        int k = 0;

        // Finding the position to insert
        while(k < n && num[k] < insert) {
            second[k] = num[k];
            k++;
        }

        second[k] = insert;

        // Inserting remaining elements
        for(int i = k+1; i < length_arr; i++) {
            second[i] = num[i-1];
        }

        String output_two = "After inserting " + insert + " in the array, the list contains: ";
        for(int i = 0; i < length_arr; i++) {
            output_two += second[i] + " ";
        }
        JOptionPane.showMessageDialog(null, output_two);
    }    
}
