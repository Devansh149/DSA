import java.util.Scanner;
public class index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("Pallindrome Number");
        }
        else{
            System.out.println("Not a Pallindrome Number");
        }
    }
}