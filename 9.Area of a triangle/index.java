import java.util.Scanner;
public class index{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first side of triangle(length):");
        double a=sc.nextDouble();   
        System.out.print("Enter the second side of triangle(length):");
        double b=sc.nextDouble();   
        System.out.print("Enter the third side of triangle(length):");
        double c=sc.nextDouble();   
        double s=(a+b+c)/2;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("Area:%.2f%n",area);
    }
}