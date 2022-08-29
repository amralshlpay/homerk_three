import java.util.Scanner;

public class Q_three {
    public static void main(String[] args) {
        Scanner number =new Scanner(System.in);
        System.out.println("enter any number");
        int num = number.nextInt();
        if (num>0)
            System.out.println("positive");
        else if (num<0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }
}
