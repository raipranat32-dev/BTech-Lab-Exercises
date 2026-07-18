import java.util.Scanner;

public class clear_last_ith_bits {
    static int clear(int a , int i)
    {
        return (a & (~(0) << i));
    }
    public static void main()
    {
        int a, i;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       a = sc.nextInt();
       System.out.println("which bit is needed ? ");
       i = sc.nextInt();
       System.out.println("after clearing last i bits  : "+clear(a,i));
    }
    
}
