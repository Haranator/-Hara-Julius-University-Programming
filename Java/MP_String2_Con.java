package Java;
/*
 That will replace a specified character with another character.
 Sample Output:
 Original string: The quick brown fox jumps over the lazy dog. 
 New String: The quick brown fox jumps over the lazy fog.
 Filename: MP_String2_GUI.java & MP_String2_Con.jav
*/

public class MP_String2_Con 
{
    public static void main(String [] args)
    {
        String orig = "The quick brown fox jumps over the lazy dog";
        StringBuilder sentence = new StringBuilder(orig);
        
        sentence.deleteCharAt(40);
        sentence.replace(40, 40, "f");
        
        System.out.print(sentence);
    }
}
