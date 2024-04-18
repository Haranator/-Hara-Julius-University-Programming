import java.util.Scanner;

public class MP_Array5_Con {
    public static void main(String[] args)
    {
        Scanner rd = new Scanner(System.in);
        int n, insert;

        System.out.print("Input the size of the array: ");
        n = rd.nextInt();
        // The array
        int num[] = new int[n];

        System.out.print("Input " + n + " elements in the sorted array in ascending order\n");
        for(int i = 0; i < n; i++ )
        {
            System.out.print("Input element[" + (i+1) +"]: ");
            num[i] = rd.nextInt();
        }

        System.out.print("The current list of the array:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" " + num[i]);
        }

        System.out.println("Input the value to be inserted: ");
        insert = rd.nextInt();

        rd.close();

        int elem_new = n + 1;
        //new array
        int second[] = new int[elem_new];

        for(int i = 0; i < n; i++)
        {
            second[i] = num[i];
        }
        second[elem_new] = insert;
        int temp;


        for (int i = 0; i < elem_new; i++) 
        {
            for (int j = 0; j < (elem_new); j++) 
            {
                if (second[j] > second[j]) 
                {
                    // Swap elements
                    temp = second[j];
                    second[j] = second[j];
                    second[j] = temp;
                }
            }
        }

        System.out.println("After Inserting New the Array List contains: ");
        for(int i = 0; i < elem_new; i++)
        {
            System.out.print(" " + second[i]);
        }
        System.out.print("\n");

    }    
}