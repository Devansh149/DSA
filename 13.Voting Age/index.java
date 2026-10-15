import java.util.Scanner;
public class index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        if(age<=0){
            System.out.println("Age should be greater than 0");
        }
        else if(age<18){
            System.out.println("Wait "+(18-age)+" more years to vote!");
        }
        else{
            System.out.println("You are eligible for voting");
        }
    }
}