import java.util.Scanner;

public class clear_ith_bit {
    static int clear(int n, int i)
    {
        return (n & (~(1 << i)));
    }
    public static void main()
    {
      int a, i;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       a = sc.nextInt();
       System.out.println("which bit is needed ? ");
       i = sc.nextInt();
       System.out.println(" Number after clearing the specified bit is: "+clear(a,i));
    }
}
