import javax.swing.*;

class GUILargestSmallest {
    public static void main(String[] args)
    {
        float smallest, largest, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;

        String input1 = JOptionPane.showInputDialog("Please input 10 numbers[1]: ");
        n1 = Float.parseFloat(input1);

        String input2 = JOptionPane.showInputDialog("Please input 10 numbers[2]: ");
        n2 = Float.parseFloat(input2);

        String input3 = JOptionPane.showInputDialog("Please input 10 numbers[3]: ");
        n3 = Float.parseFloat(input3);

        String input4 = JOptionPane.showInputDialog("Please input 10 numbers[4]: ");
        n4 = Float.parseFloat(input4);

        String input5 = JOptionPane.showInputDialog("Please input 10 numbers[5]: ");
        n5 = Float.parseFloat(input5);

        String input6 = JOptionPane.showInputDialog("Please input 10 numbers[6]: ");
        n6 = Float.parseFloat(input6);

        String input7 = JOptionPane.showInputDialog("Please input 10 numbers[7]: ");
        n7 = Float.parseFloat(input7);

        String input8 = JOptionPane.showInputDialog("Please input 10 numbers[8]: ");
        n8 = Float.parseFloat(input8);

        String input9 = JOptionPane.showInputDialog("Please input 10 numbers[9]: ");
        n9 = Float.parseFloat(input9);

        String input10 = JOptionPane.showInputDialog("Please input 10 numbers[10]: ");
        n10 = Float.parseFloat(input10);

        largest = Math.max(n1, n2);
        largest = Math.max(largest, n3);
        largest = Math.max(largest, n4);
        largest = Math.max(largest, n5);
        largest = Math.max(largest, n6);
        largest = Math.max(largest, n7);
        largest = Math.max(largest, n8);
        largest = Math.max(largest, n9);
        largest = Math.max(largest, n10);

        smallest = Math.min(n1, n2);
        smallest = Math.min(smallest, n3);
        smallest = Math.min(smallest, n4);
        smallest = Math.min(smallest, n5);
        smallest = Math.min(smallest, n6);
        smallest = Math.min(smallest, n7);
        smallest = Math.min(smallest, n8);
        smallest = Math.min(smallest, n9);
        smallest = Math.min(smallest, n10);

        JOptionPane.showMessageDialog(null, "Largest number: " + largest);
        JOptionPane.showMessageDialog(null, "Smallest number: " + smallest);
    }    
}
