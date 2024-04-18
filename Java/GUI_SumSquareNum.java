package Java;
import javax.swing.JOptionPane;

public class GUI_SumSquareNum 
{
    public static void main(String []args)
    {
        String new_n = "";
        double summation = 0;
        String text = JOptionPane.showInputDialog("Program that outputs the square up until the number inputted\nEnter number: ");
        int n = Integer.parseInt(text);

        /*for loop that meets the condition by printing 
         *the square of i until it reaches the value of n*/
        for(int i = 1; i <= n ; i++)
        {
            new_n += String.format("\nsquare of " + i + " is " + Double.toString(Math.pow(i, 2)));
            summation += Math.pow(i, 2);
        }
        JOptionPane.showMessageDialog(null, new_n);
        JOptionPane.showMessageDialog(null, "The summation of all Square of the number from 1: " + summation); 
    }
}
