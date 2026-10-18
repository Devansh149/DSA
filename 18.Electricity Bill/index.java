import java.util.Scanner;
public class index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the units consumed:");
        int units=sc.nextInt();
        int bill=0;
        if(units>=0 && units<=100 ){
            bill=(units*4)+50;
            System.out.print("Total bill:"+bill);
        }
        else if(units>100 && units<=300){
            bill=(100*4)+(units-100)*6+50;
            System.out.print("Total bill:"+bill);
        }
        else if(units>300){
            bill=(100*4)+(200*6)+(units-300)*9+50;
            System.out.print("Total bill:"+bill);
        }
        else{
            System.out.print("Enter valid units");
        }
    }
}