import java.util.Scanner;
class MP_Array2_Con
{
    public static void main(String[] args)
    {
        int num[] = new int[3];
        StringBuilder format = new StringBuilder();
        StringBuilder format_two = new StringBuilder();
        Scanner rd = new Scanner(System.in);

        /* Concatenate the first sentence of the format */
        format.append("The values store into the array are: ");
        format_two.append("The values store into the array in reverse are:");

        /*Gets the in for the elements and appends in the original format */
        for(int i = 1; i<=3; i++)
        {
            System.out.print("Input Element[" + i + "]: " );
            num[i-1] = rd.nextInt();
            format.append(" " + num[i-1]);
        }

        for (int i = 2; i >= 0; i--) {
            format_two.append(" " + num[i]);
        }

        rd.close();
        
        System.out.println(format);
        System.out.println(format_two);
    }
}