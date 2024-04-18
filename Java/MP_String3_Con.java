package Java;
/*
 That converts all characters in a string to lowercase.
 Sample Output:
 Original String: The Quick BroWn FoX! 
 String in lowercase: the quick brown fox!
 Filename: MP_String3_GUI.java & MP_String3_Con.java
*/
import java.util.Scanner;

public class MP_String3_Con 
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text to lowercase: ");
        String orig = scan.nextLine();
        String sentence = orig.toLowerCase();

        scan.close();
        
        System.out.println("Original String: " + orig);
        System.out.println("String in Lowercase: " + sentence);
    }
}
