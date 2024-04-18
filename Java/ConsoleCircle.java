package Java;
import java.util.Scanner;

class ConsoleCircle {
    public static void main(String[] args)
    {
        double result;

        Scanner scan = new Scanner(System.in);

        System.out.println("C for Circumeference\nA for Area\nD for Diameter");
        System.out.println("Input choice: ");
        String choice = scan.nextLine();

        System.out.println("Input radius");
        double radius = scan.nextDouble();

        scan.close();

        switch(choice){
            case "C":
            case "c":
                result = 2 * Math.PI * radius;
                System.out.println("The circumference is " + result);
                break;
            case "A":
            case "a":
                result = Math.PI * Math.pow(radius, 2);
                System.out.println("The area is " + result);
                break;
            case "D":
            case "d":
                result = radius * 2;
                System.out.println("The diameter is " + result);
                break;
            default:
                System.out.println("Error: Wrong Input");
                break;
        }
    }    
}
