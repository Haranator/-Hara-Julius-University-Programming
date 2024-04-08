package Java;
import javax.swing.JOptionPane;

public class GUI_MultiplicationTable 
{
    public static void main(String[] args) 
    {
        String table = "<html><pre>";
        String line;
        
        for (int i = 1; i <= 10; i++) 
        {
            for (int n = 1; n <= 10; n++) 
            {
                int num = i * n;
                line = String.format("%-4d", num);
                table += line;
            }
            table += "<br>";
        }
        
        table += "</pre></html>";
        
        JOptionPane.showMessageDialog(null, "This program shows a 10x10 Multiplication Table \n" + table);
    }
}
