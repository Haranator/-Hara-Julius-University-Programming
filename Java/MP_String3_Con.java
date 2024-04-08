package Java;
/*
 That converts all characters in a string to lowercase.
 Sample Output:
 Original String: The Quick BroWn FoX! 
 String in lowercase: the quick brown fox!
 Filename: MP_String3_GUI.java & MP_String3_Con.java
*/

public class MP_String3_Con 
{
    public static void main(String [] args)
    {
        String orig = "The Quick BroWn FoX! ";
        String sentence = orig.toLowerCase();
        
        System.out.println("Original String: " + orig);
        System.out.println("String in Lowercase: " + sentence);
    }
}
