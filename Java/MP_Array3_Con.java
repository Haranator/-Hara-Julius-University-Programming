package Java;
import java.util.Scanner;

class MP_Array3_Con
{
    public static void main(String [] args)
    {
        int number=0;
        Scanner rd = new Scanner(System.in);
        try
        {
            System.out.print("Input the number of elements to be stored in the array: ");
            int n = rd.nextInt();
    
            int num[] = new int[n];
    
            System.out.println("Input " + n + " elements in the array");
            for(int i = 1; i <= n; i++)
            {
                System.out.print("Input element[" + i + "]: ");
                num[i-1] = rd.nextInt();
                number += num[i-1];
            }
            rd.close();

            System.out.println("Sum of all elements stored in the array is: " + number);
        }

        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }

    }
}