package Java;
public class SqRootPowerNum {
    public static void main(String[] args){
        
        double square, square_root, fourth_pow;
        String format;
        String label, s = "square", sr = "square root", fp = "fourth power";
        System.out.println("program that computes for the square, square root and the fourth power of numbers  from 0 to 50.");
        label = String.format("          \t%-10s %-20s %-20s", s, sr, fp);

        System.out.println(label);
        for(int i = 0; i <= 50; i++)
        {
            square = Math.pow(i, 2);
            square_root = Math.sqrt(i);
            fourth_pow = Math.pow(i, 4);
            format = String.format("\t%-10s %-20s %-20s", square, square_root, fourth_pow);
            System.out.println("Result of["+ i +"]: " + format);
        }
    }
}
