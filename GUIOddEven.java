import javax.swing.JOptionPane;

class GUIOddEven {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Identifies Odd and Even Numbers");

        String input = JOptionPane.showInputDialog("Input Integer: ");
        int num = Integer.parseInt(input);

        int iden = num % 2;

        if(iden == 1 || iden == -1)
        {
            JOptionPane.showMessageDialog(null, "The number " + num + " is an Odd Number");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The number " + num + " is an Even Number");
        }
    }
}
