import java.util.Scanner;
public class index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        // Approach 1
        // int n=sc.nextInt();
        // int rev=0;
        // while(n!=0){
        //     rev=rev*10+n%10;
        //     n=n/10;
        // }
        // while(rev!=0){
        //     System.out.println(rev%10);
        //     rev=rev/10;     
        // }
        //Approach 2
        String num=sc.nextLine();
        for(int i=0;i<num.length();i++){
            System.out.println(num.charAt(i));
        }
    }
}