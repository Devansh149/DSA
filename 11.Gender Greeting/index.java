import java.util.Scanner;
public class index{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your gender(m for male and f for female):");
        String g=sc.nextLine().toLowerCase();
        if(g.equals("m")){
            System.out.println("Hello, Sir");
        } 
        else if(g.equals("f")){
            System.out.println("Hello, Mam");
        }
        else{
            System.out.println("Invalid Entry");
        }
    }
}