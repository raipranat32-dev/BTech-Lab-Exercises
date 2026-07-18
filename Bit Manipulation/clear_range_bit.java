import java.util.*;
public class clear_range_bit {
    static int clear(int n, int i, int j)
    {
        int a = ( ~0 << j+1);
        int b = (1 << i) - 1;
        return (n & (a | b));
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a, i , j ;
        System.out.print("Enter the number: ");
        a = sc.nextInt();
        System.out.print("Enter the value of i: ");
        i = sc.nextInt();
        System.out.print("Enter the value of j: ");
        j= sc.nextInt();
        System.out.println("Required number after clearing bits within specified range is :"+clear(a,i,j));
    }
}
