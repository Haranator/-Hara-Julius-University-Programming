package Java;
import java.util.Scanner;

class ConsoleNumberWord {
    public static void main(String[] args)
    {
        int input, thousand, hundreds, spec_tens, tens, ones;
        String output = "";

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input value to be converted to number word:");
        input = scan.nextInt();
        
        scan.close();

        thousand = input / 1000;
        hundreds = (input % 1000)/100;
        spec_tens = input % 100;
        tens = (input % 100) / 10;
        ones = input % 10;


        switch(thousand)
        {
            case 1:
                output += " One Thousand";
                break;
            case 2:
                output += " Two Thousand";
                break;
            case 3:
                output += " Three Thousand";
                break;
            case 4:
                output += " Four Thousand";
                break;
            case 5:
                output += " Five Thousand";
                break;
            case 6:
                output += " Six Thousand";
                break;
            case 7:
                output += " Seven Thousand";
                break;
            case 8:
                output += " Eight Thousand";
                break;
            case 9:
                output += " Nine Thousand";
                break;
            default:
                output += "";
                break;
        }

        switch(hundreds)
        {
            case 1:
                output += " One Hundred";
                break;
            case 2:
                output += " Two Hundred";
                break;
            case 3:
                output += " Three Hundred";
                break;
            case 4:
                output += " Four Hundred";
                break;
            case 5:
                output += " Five Hundred";
                break;
            case 6:
                output += " Six Hundred";
                break;
            case 7:
                output += " Seven Hundred";
                break;
            case 8:
                output += " Eight Hundred";
                break;
            case 9:
                output += " Nine Hundred";
                break;
            default:
                output += "";
                break;
        }
        if(10 < spec_tens && 20 > spec_tens)
        {
            switch(spec_tens)
            {
                case 11:
                    output += " Eleven";
                    break;
                case 12:
                    output += " Twelve";
                    break;
                case 13:
                    output += " Thirteen";
                    break;
                case 14:
                    output += " Fourteen";
                    break;
                case 15:
                    output += " Fifteen";
                    break;
                case 16:
                    output += " Sixteen";
                    break;
                case 17:
                    output += " Seventeen";
                    break;
                case 18:
                    output += " Eighteen";
                    break;
                case 19:
                    output += " Nineteen";
                    break;
                default:
                    output += "";
                    break;
            }
        }
        else
        {
            switch(tens)
            {
                case 1:
                    output += " Ten";
                    break;
                case 2:
                    output += " Twenty";
                    break;
                case 3:
                    output += " Thirty";
                    break;
                case 4:
                    output += " Fourty";
                    break;
                case 5:
                    output += " Fifty";
                    break;
                case 6:
                    output += " Sixty";
                    break;
                case 7:
                    output += " Seventy";
                    break;
                case 8:
                    output += " Eighty";
                    break;
                case 9:
                    output += " Ninety";
                    break;
                default:
                    output += "";
                    break;
            }
            switch(ones)
            {
                case 1:
                    output += " One";
                    break;
                case 2:
                    output += " Two";
                    break;
                case 3:
                    output += " Three";
                    break;
                case 4:
                    output += " Four";
                    break;
                case 5:
                    output += " Five";
                    break;
                case 6:
                    output += " Six";
                    break;
                case 7:
                    output += " Seven";
                    break;
                case 8:
                    output += " Eight";
                    break;
                case 9:
                    output += " Nine";
                    break;
                default:
                    output += "";
                    break;
            }
        }

        if(input == 0 )
        {
            output += " Zero";
            System.out.println("Result:" + output);
        }
        else if(input > 9999)
        {
            output = "Error: Inputted value exceeds limit";
            System.out.println(output);
        }
        else if (input < 0 )
        {
            output = "Error: Negative Value Inputted";
            System.out.println(output);
        }
        else 
        {
            System.out.println("Result:" + output);
        }
    }
}
