package Java;
import javax.swing.JOptionPane;

public class GUI_ConsoleFactorial {
    public static void main(String[] args)
    {
        int factorial = 1;
        String text = JOptionPane.showInputDialog("Input number to factorial: ");
        int num = Integer.parseInt(text);


        for(int i = 1; i < num; num--)
        {
            factorial *= num;
        }

        JOptionPane.showMessageDialog(null, "The factorial of " + num + " is " + factorial);

    }
}
