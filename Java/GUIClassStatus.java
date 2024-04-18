package Java;
import javax.swing.*;

class GUIClassStatus {
    public static void main(String[] args)
    {
        int  rm_num, rm_cap, rm_stud, rm_emp;
        String input1 = JOptionPane.showInputDialog("Enter Room Number: ");
        rm_num = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Enter Room Capacity: ");
        rm_cap = Integer.parseInt(input2);

        String input3 = JOptionPane.showInputDialog("Enter Enrolled Students: ");
        rm_stud = Integer.parseInt(input3);

        rm_emp = rm_cap - rm_stud;

        if(rm_stud > rm_cap)
        {
            JOptionPane.showMessageDialog(null, "Error Maximum capacity is " + rm_cap + " students");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Room Number: " + rm_num + "\nCapacity: " + rm_cap + "\nEnrolled Students: " + rm_stud);
            
            if(rm_emp <= 0 )
            {
                JOptionPane.showMessageDialog(null,"Empty Seats: " + rm_emp + "\nStatus: Full");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Empty seats: " + rm_emp + "\nStatus: Available");
            }
        }
    }
    
}
