import java.util.Scanner;
public class index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int org_num=num;
        int sum=0;
        if(num>0){
            while(org_num!=0){
                int temp=org_num%10;
                int fact=1;
                for(int i=2;i<=temp;i++){
                    fact=fact*i;
                }
                sum+=fact;
                org_num=org_num/10;
            }
            if(num==sum){
                System.out.print("Strong Number");
            }
            else{
                System.out.print("Not a Strong Number");
            } 
        }
        else{
            System.out.print("Enter a valid number");
        }
    }
}