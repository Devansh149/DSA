import java.util.Scanner;

public class index{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal amount:");
        int principal=sc.nextInt();
        System.out.print("Enter the rate of interest:");
        double rate=sc.nextDouble();
        rate=rate/100;
        System.out.print("Compounding times(1 for annually, 2 for semi-annually, 4 for quaterly and 12 for monthly):");
        int n=sc.nextInt();
        System.out.print("Enter the time:");
        int time=sc.nextInt();
        double amount=principal*Math.pow((1+(rate/n)),n*time);
        double ci=amount-principal;
        System.out.printf("Amount:%.2f",amount);
        System.out.printf("Compund Interest:%.2f", ci);
    }
}
