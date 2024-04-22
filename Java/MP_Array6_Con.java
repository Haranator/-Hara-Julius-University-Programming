import java.util.Scanner;

public class MP_Array6_Con {
    public static void main(String[] args)
    {
        Scanner rd = new Scanner(System.in);
        int n, insert, position;

        System.out.print("Input the size of the array: ");
        n = rd.nextInt();
        // The array
        int num[] = new int[n];

        System.out.print("Input" + n + "elements in the array in ascending order\n");
        for(int i = 0; i < n; i++ )
        {
            System.out.print("Input element[" + (i+1) +"]: ");
            num[i] = rd.nextInt();
        }

        System.out.print("Input the value to be inserted: ");
        insert = rd.nextInt();

        System.out.print("Input the position, where the value should be inserted: ");
        position = rd.nextInt() - 1;

        rd.close();

        System.out.print("The current list of the array:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" " + num[i]);
        }

        int elem_new = n + 1;
        //new array
        int second[] = new int[elem_new];

        System.out.print("\nAfter the insert, the array list is:");
        for(int i = 0, j = 0; i < elem_new; i++)
        {
            if(i == position)
            {
                second[position] = insert;
            }
            else
            {
                second[i] = num[j];
                j++;
            }
        }
        for(int i = 0; i < elem_new; i++)
        {
            System.out.print(" " + second[i]);
        }
        System.out.print("\n");

    }    
}