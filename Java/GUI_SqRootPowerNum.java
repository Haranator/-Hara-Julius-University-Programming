package Java;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;

/* Create a program that computes for the square, square root, and the fourth 
power of numbers from 0 to 50. Display the numbers using a neat four-column 
format with a scroll bar. */
class GUI_SqRootPowerNum {
    public static void main(String[] args) {
        // Variables
        String description = "This program computes for the square, square \nroot, and the fourth power of numbers 0 to 50\n";
        String format = "";

        // Loop for the numbers 0 to 50
        for (int i = 0; i <= 50; i++) {
            // Calculations for the numbers
            double square = Math.pow(i, 2);
            double squareRoot = Math.sqrt(i);
            double fourthPower = Math.pow(i, 4);

            // Formatting numbers into four columns
            String row = String.format("%-10d%-15.2f%-15.2f%-15.2f%n", i, square, squareRoot, fourthPower);
            format += row;
        }

        // Create a JTextArea to display formatted output
        JTextArea textArea = new JTextArea(description + format);
        textArea.setEditable(false);

        // Set preferred size for JTextArea
        textArea.setRows(20); // Adjust as needed

        // Create a JScrollPane to add a scrollbar
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(300, 300)); // Set preferred size for scroll pane

        // Show the JOptionPane with the scrollable text area
        JOptionPane.showMessageDialog(null, scrollPane);
    }
}
