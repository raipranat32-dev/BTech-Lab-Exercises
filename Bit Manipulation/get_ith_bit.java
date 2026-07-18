import java.util.*;
public class get_ith_bit {
    static void ith_bit(int n, int i)
    {
        if((n & (1 << 2)) == 0)
            System.out.println(i+" th bit is: 0");
        else
            System.out.println(i+" th bit is: 1");
    }
    public static void main(String args[])
    {
       int a, i;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       a = sc.nextInt();
       System.out.println("which bit is needed ? ");
       i = sc.nextInt();
       ith_bit(a,i);
    }
    
}
