import javax.swing.JOptionPane;

class GUIMinMaxAve {
    public static void main(String[] args) {

        float num_max = Float.MIN_VALUE, num_min = Float.MAX_VALUE, num_ave = 0, count = 0;

        JOptionPane.showMessageDialog(null, "Calculates Min, Max, and Average number\n Input negative numbers to end program.");

        while (true) {
            String text = JOptionPane.showInputDialog("Input number: ");
            float input = Float.parseFloat(text);
            if (input < 0) {
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "ERROR: No data entered.");
                } else {
                    break;
                }
            } else {
                num_min = Math.min(num_min, input);
                num_max = Math.max(num_max, input);
                num_ave += input;
                count++;
            }
        }

        if (count > 0) {
            float ave = num_ave / count;
            JOptionPane.showMessageDialog(null, "Minimum value entered: " + num_min);
            JOptionPane.showMessageDialog(null, "Maximum value entered: " + num_max);
            JOptionPane.showMessageDialog(null, "Average of the positive values entered: " + ave);
        }
    }
}
