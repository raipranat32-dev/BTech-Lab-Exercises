import java.util.*;
public class display {
    public static void main(String []args)
    {
          Scanner sc = new Scanner(System.in);
        int i=1;
        while(i>0)
        {
            int n;
            System.out.println("Enter the number");
            n= sc.nextInt();
            if(n%10 == 0)
            {
                continue;
            }
            else 
            {
                System.out.print(n);
            }
            n=0;
        }
    }
    
}
