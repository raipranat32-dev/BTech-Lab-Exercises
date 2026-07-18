import java.util.Scanner;

public class update_ith_bit {
      static int clear(int n, int i)
    {
        return (n & (~(1 << i)));
    }
    static int set(int n , int i)
    {
        return (n | (1 << i));
    }
    static int update(int n, int i , int u)
    {
        if(u == 0)
         return   clear(n,i);
        else
            return set(n,i);
    }
    public static void main()
    {
        int a, i,u;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       a = sc.nextInt();
       System.out.println("which bit is needed ? ");
       i = sc.nextInt();
       System.out.println("Give the Updated bit");
       u = sc.nextInt();
       System.out.println("The number after update is : "+update(a, i, u));
    }
}
