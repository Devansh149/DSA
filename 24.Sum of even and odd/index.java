import java.util.Scanner;
public class index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int oddSum=0;
        int evenSum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }
        }
        System.out.println("Even:"+evenSum);
        System.out.println("Odd:"+oddSum);
    }
}