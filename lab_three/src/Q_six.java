import java.util.Scanner;

public class Q_six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum[]= new float[3];
        String an;
        System.out.println("Enter three numbers please");
        for(int i=1;i<=3;i++){
            System.out.print("The number "+i+" = ");
            sum[i-1]=input.nextFloat();
        }

        an=(sum[0]<sum[1]&&sum[1]<sum[2])? "Increasing" :(sum[0]>sum[1]&&sum[1]>sum[2])? "Decreasing" : "Neither";
        System.out.println("--->"+an);
    }
}
