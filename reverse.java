import java.util.*;
public class reverse {
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        int n,m=0;
        System.out.println("Enter a number");
        n= sc.nextInt();
        System.out.print("Reversed Number is:");
        while(n!=0)
        {
            m*=10;
          m=m+(n%10);
          n/=10;
        }
        System.out.print(m);
    }
}
