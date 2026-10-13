public class index{
    public static void main(String[] args){
        //With a temporary variable
        int a=2;
        int b=3;
        System.out.println(a);
        System.out.println(b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        //Without a temporary variable
        int c=2;
        int d=3;
        System.err.println(c);
        System.err.println(d);
        c=c+d;
        d=c-d;
        c=c-d;
        System.err.println(c);
        System.err.println(d);
        //Without temporary variable
        int e=2;
        int f=3;
        System.err.println(e);
        System.err.println(f);
        e=e^f;
        f=e^f;
        e=e^f;
        System.err.println(e);
        System.err.println(f);
    }
}