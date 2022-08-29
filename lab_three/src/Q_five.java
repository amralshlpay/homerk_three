import java.util.Scanner;

public class Q_five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float neme[]= new float[3];
        String an;
        System.out.println("Enter three numbers please");
        for(int i=1;i<=3;i++){
            System.out.print("The number "+i+" = ");
            neme[i-1]=in.nextFloat();
        }

        an=(neme[0]==neme[1]&&neme[0]==neme[2])? "All the same" :(neme[0]!=neme[1]&&neme[0]!=neme[2])? "All the different" : "Neither";
        System.out.println("--->"+an);
    }
}
