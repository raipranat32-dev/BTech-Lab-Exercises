import java.util.*;
public class EvenorOdd {

    static void odd_eve(int n)
    {
        if((n & 1) == 0)
            System.out.println("It's an even Number");
        else
            System.out.println("It's an odd Number");
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Eneter the number: ");
        n = sc.nextInt();
        odd_eve(n);
    }
    
}
