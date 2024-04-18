package Java;
import java.util.Scanner;

class ConsoleClassStatus {
    public static void main(String[] args)
    {
        int  rm_num, rm_cap, rm_stud, rm_emp;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Room Number: ");
        rm_num = scan.nextInt();

        System.out.println("Enter Room Capacity: ");
        rm_cap = scan.nextInt();

        System.out.println("Enter Enrolled Students: ");
        rm_stud = scan.nextInt();

        scan.close();

        rm_emp = rm_cap - rm_stud;

        if(rm_stud > rm_cap)
        {
            System.out.println("Error Maximum capacity is " + rm_cap + " students");
        }
        else
        {
            System.out.println("Room Number: " + rm_num + "\nCapacity: " + rm_cap + "\nEnrolled Students: " + rm_stud);
            
            if(rm_emp <= 0 )
            {
                System.out.println("Empty Seats: " + rm_emp + "\nStatus: Full");
            }
            else
            {
                System.out.println("Empty seats: " + rm_emp + "\nStatus: Available");
            }
        }
    }
    
}
