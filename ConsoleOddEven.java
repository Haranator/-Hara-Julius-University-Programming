import java.util.Scanner;

class ConsoleOddEven {
    public static void main(String[] args)
    {
        System.out.println("Identifies Odd and Even Numbers");

        Scanner scan = new Scanner(System.in);

        System.out.print("Input Integer: ");
        int num = scan.nextInt();
        
        scan.close();

        int iden = num % 2;

        if(iden == 1 || iden == -1)
        {
            System.out.println("The number " + num + " is an Odd Number");
        }
        else
        {
            System.out.println("The number " + num + " is an Even Number");
        }
    }
}
