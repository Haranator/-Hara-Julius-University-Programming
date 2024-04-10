import java.util.Scanner;
class MP_Array2_Con
{
    public static void main(String[] args)
    {
        int n;
        StringBuilder format = new StringBuilder();
        StringBuilder format_two = new StringBuilder();
        Scanner rd = new Scanner(System.in);

        try
        {
            /* Concatenate the first sentence of the format */
            format.append("The values store into the array are: ");
            format_two.append("The values store into the array in reverse are:");

            /*How many elements*/
            System.out.print("Input the number of elements to store in the array: ");
            n = rd.nextInt();

            int num[] = new int[n];

            System.out.println("Input" + n + "numbers in the element array: ");

            /*Gets the in for the elements and appends in the original format */
            for(int i = 1; i<= n; i++)
            {
                System.out.print("Input Element[" + i + "]: " );
                num[i-1] = rd.nextInt();
                format.append(" " + num[i-1] + ",");
            }

            for (int i = n-1; i >= 0; i--) 
            {
                format_two.append(" " + num[i] + ",");
            }

            rd.close();
        
            System.out.println(format);
            System.out.println(format_two);
        }

        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
        
    }
}