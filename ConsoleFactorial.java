import java.util.Scanner;

public class ConsoleFactorial {
    public static void main(String[] args)
    {
        int factorial = 1;
        Scanner reader = new Scanner(System.in);
        System.out.print("Input number to factorial: ");
        int num = reader.nextInt();
        int num_const = num;

        reader.close();

        for(int i = 1; i < num; num--)
        {
            factorial *= num;
        }

        System.out.println("The factorial of " + num_const + " is " + factorial);

    }
}
