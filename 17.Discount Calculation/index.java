import java.util.Scanner;
public class index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the original price:");
        int price=sc.nextInt();
        double finalAmount=0;
        if(price<1000){
            System.out.print("No discount below $1000");
        }
        else if(price>=1000 && price<5000){
            finalAmount=price-((10.0/100)*price);
            System.out.print(finalAmount);
        }
        else if(price>=5000){
            finalAmount=price-((20.0/100)*price);
            System.out.print(finalAmount);
        }
        else{
            System.out.print("Enter Valid Price");
        }
    }
}