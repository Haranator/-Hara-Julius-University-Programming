import java.util.Scanner;

class SumSquareNum {
    public static void main (String [] args)
    {
        double new_n;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = reader.nextInt();
        //reader closes
        reader.close();

        /*for loop that meets the condition by printing 
         *the square of i until it reaches the value of n*/
        for(int i = 1; i < n ; i++)
        {
            new_n = Math.pow(i, 2);
            System.out.println("square of " + i + " is " + new_n);

        }
    }
}
