import java.util.Scanner;
public class set_ith_bit {
    static int set(int n , int i)
    {
        return (n | (1 << i));
    }
    public static void main(String args[])
    {
      int a, i;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       a = sc.nextInt();
       System.out.println("which bit is needed ? ");
       i = sc.nextInt();
       System.out.println("after setting bit to 1 the number becomes : "+set(a,i));
    }
}
