import java.util.Scanner;

class ConsoleLargestSmallest {
    public static void main(String[] args)
    {
        float smallest, largest, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please input 10 numbers[1]: ");
        n1 = scan.nextFloat();

        System.out.print("Please input 10 numbers[2]: ");
        n2 = scan.nextFloat();

        System.out.print("Please input 10 numbers[3]: ");
        n3 = scan.nextFloat();

        System.out.print("Please input 10 numbers[4]: ");
        n4 = scan.nextFloat();

        System.out.print("Please input 10 numbers[5]: ");
        n5 = scan.nextFloat();

        System.out.print("Please input 10 numbers[6]: ");
        n6 = scan.nextFloat();

        System.out.print("Please input 10 numbers[7]: ");
        n7 = scan.nextFloat();

        System.out.print("Please input 10 numbers[8]: ");
        n8 = scan.nextFloat();

        System.out.print("Please input 10 numbers[9]: ");
        n9 = scan.nextFloat();

        System.out.print("Please input 10 numbers[10]: ");
        n10 = scan.nextFloat();

        scan.close();

        largest = Math.max(n1, n2);
        largest = Math.max(largest, n3);
        largest = Math.max(largest, n4);
        largest = Math.max(largest, n5);
        largest = Math.max(largest, n6);
        largest = Math.max(largest, n7);
        largest = Math.max(largest, n8);
        largest = Math.max(largest, n9);
        largest = Math.max(largest, n10);

        smallest = Math.min(n1, n2);
        smallest = Math.min(smallest, n3);
        smallest = Math.min(smallest, n4);
        smallest = Math.min(smallest, n5);
        smallest = Math.min(smallest, n6);
        smallest = Math.min(smallest, n7);
        smallest = Math.min(smallest, n8);
        smallest = Math.min(smallest, n9);
        smallest = Math.min(smallest, n10);

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }    
}
