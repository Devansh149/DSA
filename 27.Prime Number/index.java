import java.util.Scanner;
public class index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        // Approach 1
        // int sum=0;
        // if(num>1){
        //     for(int i=1;i<=num;i++){
        //         if(num%i==0){
        //             sum++;
        //         }
        //     }
        // }
        // if(sum==2){
        //     System.out.print("Prime Number");
        // }
        // else{
        //     System.out.print("Not a Prime Number");
        // }
        // Approach 2
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }

    }
}