import javax.swing.JOptionPane;

class GUICircle {
    public static void main(String[] args)
    {
        double result;


        String choice = JOptionPane.showInputDialog("C for Circumeference\nA for Area\nD for Diameter\nInput choice: ");
        String text = JOptionPane.showInputDialog("Input radius");
        double radius = Double.parseDouble(text);

        switch(choice){
            case "C":
            case "c":
                result = 2 * Math.PI * radius;
                JOptionPane.showMessageDialog(null, "The circumference is " + result);
                break;
            case "A":
            case "a":
                result = Math.PI * Math.pow(radius, 2);
                JOptionPane.showMessageDialog(null, "The area is " + result);
                break;
            case "D":
            case "d":
                result = radius * 2;
                JOptionPane.showMessageDialog(null, "The diameter is " + result);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Wrong Input");
                break;
        }
    }    
}
