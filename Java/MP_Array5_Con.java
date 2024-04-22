import java.util.Scanner;

public class MP_Array5_Con {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int n, insert;

        System.out.print("Input the size of the array: ");
        n = rd.nextInt();
        // The array
        int num[] = new int[n];

        System.out.print("Input " + n + " elements in the sorted array in ascending order\n");
        for(int i = 0; i < n; i++) {
            System.out.print("Input element[" + (i+1) +"]: ");
            num[i] = rd.nextInt();
        }

        System.out.println("The current list of the array:");
        for(int i = 0; i < n; i++) {
            System.out.print(" " + num[i]);
        }

        System.out.println("\nInput the value to be inserted: ");
        insert = rd.nextInt();

        rd.close();

        int length_arr = n+1;
        int second[] = new int[length_arr];
        int k = 0;

        // Finding the position to insert
        while(k < n && num[k] < insert) {
            second[k] = num[k];
            k++;
        }

        second[k] = insert;

        // Inserting remaining elements
        for(int i = k+1; i < length_arr; i++) {
            second[i] = num[i-1];
        }

        System.out.println("After inserting " + insert + " in the array, the list contains: ");
        for(int i = 0; i < length_arr; i++) {
            System.out.print(second[i] + " ");
        }
        System.out.println("");
    }    
}
