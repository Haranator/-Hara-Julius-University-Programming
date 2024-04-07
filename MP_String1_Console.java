import java.util.Scanner;

class MP_String1_Console {
    public static void main(String[] args)
    {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String text = br.nextLine();

        int str_length = text.length();
        System.out.println("The String Lenght of \"" + text + "\" is: " + str_length);

        br.close();
    }
}
