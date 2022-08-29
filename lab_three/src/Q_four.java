import java.util.Scanner;

public class Q_four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        long sum;
        System.out.println("A program that reads the digits of the number");
        System.out.print("Please enter the number >100000000 \n -->");
        sum = in.nextInt();
        sum = (sum < 0) ? sum * -1 : sum;
        s = String.valueOf(sum);
        System.out.println("number is " + s.length() + " digits");


    }
}
