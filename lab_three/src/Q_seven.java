import java.util.Scanner;

public class Q_seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum[]= new float[3];
        System.out.println("Enter three numbers please");
        for(int i=1;i<=3;i++){
            System.out.print("The number "+i+" = ");
            sum[i-1]=input.nextFloat();
        }

        if(sum[0]<sum[1]&&sum[1]<sum[2])
            System.out.println("in order "+sum[0]+" "+sum[1]+" "+sum[2]);
        else if(sum[0]>sum[1]&&sum[1]>sum[2])
            System.out.println("in order "+sum[0]+" "+sum[1]+" "+sum[2]);
        else
            System.out.println("Neither "+sum[0]+" "+sum[1]+" "+sum[2]);
    }
}
