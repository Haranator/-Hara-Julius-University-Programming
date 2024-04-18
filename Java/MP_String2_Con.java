package Java;
/*
 That will replace a specified character with another character.
 Sample Output:
 Original string: The quick brown fox jumps over the lazy dog. 
 New String: The quick brown fox jumps over the lazy fog.
 Filename: MP_String2_GUI.java & MP_String2_Con.jav
*/
import java.util.Scanner;

public class MP_String2_Con 
{
    public static void main(String [] args)
    {
        Scanner rd = new Scanner(System.in);
        
        System.out.println("Input string: ");
        String orig = rd.nextLine();
        
        System.out.println("Enter character to replace: ");
        String rep = rd.nextLine();

        System.out.println("Enter substitute: ");
        String sub = rd.nextLine();
        rd.close();
        
        for(int i = 0; i < rep.length(); i++)
        {
            orig = orig.replace(rep.charAt(i), sub.charAt(i));
        }
        
        System.out.println("New sentence: " + orig);
    }
}


/*

public class MP_String2_Con 
{
    public static void main(String [] args)
    {
        String orig = "The quick brown fox jumps over the lazy dog";
        
        StringBuilder sentence = new StringBuilder(orig);
        
        sentence.deleteCharAt(40);
        sentence.replace(40, 40, "f");
        
        System.out.println(sentence);
    }
}
*/