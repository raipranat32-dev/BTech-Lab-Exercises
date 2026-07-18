import java.util.Scanner;

public class checkprime {
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        int a,k=1,c=0;
        System.out.println("Enter a number");
        a = sc.nextInt();
        while(k<=a)
        {
            if(a%k == 0)
                c++;
            k++;
        }
        if(c == 2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
}
