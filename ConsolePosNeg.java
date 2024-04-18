import java.util.Scanner;

class ConsolePosNeg {
    public static void main(String[] args)
    {
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.print("Input Number: ");
        num = scan.nextInt();

        scan.close();

        if(num > 100)
        {
            System.out.println("Number read is greater than 100");
        }
        else if(num == 100)
        {
            System.out.println("Number read is 100");
        }
        else if(num == 10)
        {
            System.out.println("Number read is 10");
        }
        else if(num <= 10)
        {
            System.out.println("Number read is less than 10");
        }
        else
        {
            System.out.println("Number read is less than 100");
        }
    }
    
}
