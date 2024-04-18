import javax.swing.*;

class GUIPosNeg {
    public static void main(String[] args)
    {
        int num;

        String input = JOptionPane.showInputDialog(null, "Input Number: ");
        num = Integer.parseInt(input);

        if(num > 100)
        {
            JOptionPane.showMessageDialog(null, "Number read is greater than 100");
        }
        else if(num == 100)
        {
            JOptionPane.showMessageDialog(null, "Number read is 100");
        }
        else if(num == 10)
        {
            JOptionPane.showMessageDialog(null, "Number read is 10");
        }
        else if(num <= 10)
        {
            JOptionPane.showMessageDialog(null, "Number read is less than 10");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Number read is less than 100");
        }
    }
    
}
