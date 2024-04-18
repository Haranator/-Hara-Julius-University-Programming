package Java;
import java.util.Scanner;

class MinMaxAve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float num_max = Float.MIN_VALUE, num_min = Float.MAX_VALUE, num_ave = 0, count = 0;

        System.out.println("Calculates Min, Max, and Average number\n Input negative numbers to end program.");

        while (true) {
            System.out.print("Input number: ");
            float input = scan.nextFloat();

            if (input < 0) {
                if (count == 0) {
                    System.out.println("ERROR: No data entered.");
                } else {
                    break;
                }
            } else {
                num_min = Math.min(num_min, input);
                num_max = Math.max(num_max, input);
                num_ave += input;
                count++;
            }
        }

        scan.close();

        if (count > 0) {
            float ave = num_ave / count;
            System.out.println("Minimum value entered: " + num_min);
            System.out.println("Maximum value entered: " + num_max);
            System.out.println("Average of the positive values entered: " + ave);
        }
    }
}
