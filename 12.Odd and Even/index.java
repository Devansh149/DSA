import java.util.Scanner;
public class index{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        String result=(num%2==0)?"Even":"Odd";
        System.out.println(result);
    }
}