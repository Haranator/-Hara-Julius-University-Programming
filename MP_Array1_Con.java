import java.io.BufferedReader;
import java.io.InputStreamReader;

class MP_Array1_Con
{
    public static void main(String[] args)
    {
        int num[] = new int[10];
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String format = "{ ";

        try
        {
            System.out.println("Input 10 elements in this array");
            for(int i = 1; i <= 10; i++)
            {
                System.out.println("Element[" + i + "]: ");
                num[i-1]  = Integer.parseInt(rd.readLine());
                format += String.format(Integer.toString(num[i-1]) + " ");
            }

            System.out.println("The elements in the array are: " + format + "}");
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
        
    }
}