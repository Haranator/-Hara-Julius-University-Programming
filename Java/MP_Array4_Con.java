/* 
NATAPOS KO NG 4:01AM to NG APRIL 10, 2024
ANG HIRAP ISIPIN NG LOGIC, GRABE
*/ 
package Java;

import java.util.Scanner;

class MP_Array4_Con
{
    public static void main(String [] args)
    {
        Scanner rd = new Scanner(System.in);

        try
        { // Input the elements in the array
            System.out.print("Input the number of elements to be stored in the array: ");
            int n = rd.nextInt();
          // array for the input element; n being the number of storage and 2 for the original and counting
            int num[][] = new int[n][2];
          // Inputs the elements by the user
            System.out.println("Input " + n + " elements in the array");
            for(int i = 0; i < n; i++)
            {
                // Input number in array element
                System.out.print("Input element[" + i + "]: ");
                num[i][0] = rd.nextInt();
            }
            // closes the scanner
            rd.close();
            // loop to count the elements
            for(int i = 0; i < n; i++)
            {
                if(num[i][1] == 0) //[i][1] doesnt have value yet so it is literally 0
                {
                    num[i][1] = 1; // it adds value to mark it, for no repeating the process
                    for(int j = 0; j < n; j++) //loop for comparison of the first element for the rest of the elemenet
                    {
                        if(num[i][0] == num[j][0])
                        {
                            num[i][1]++; //increases count based on occurences
                            num[j][1] += -1; //the compared identical is marked -1 to prevent it later from printing
                        }
                    }
                }
                
            }
            
            
            System.out.println("\nThe frequency of all elements of an array: ");
            for(int z = 0; z < n; z++)
            { //Only those who are no -1(The identicals), and 0(not checked) are not belong in this loop
                if(num[z][1] > 0) 
                {
                    System.out.println(num[z][0] + " occurs " + num[z][1] + " times");
                }
            }
        }
        
        //Error Message; debugger
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}