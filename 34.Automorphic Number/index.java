import java.util.Scanner;
public class index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        
        if(num>=0){
            int square=num*num;
            int str_length=(String.valueOf(num)).length();
            
            int last_digit=(square%(int)Math.pow(10,str_length));
            if(last_digit==num){
                System.out.print("Automorphic Number");
            }
            else{
                System.out.print("Not a Automorphic Number");
            }
        }
        else{
            System.out.print("Number should be greater than zero");
        }
    }
}