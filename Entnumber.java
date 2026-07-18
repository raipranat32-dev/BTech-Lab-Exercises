import java.util.*;
public class Entnumber {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i=1,n=0;
        while(i>0)
        {
            System.out.println("Enter the number");
            n = sc.nextInt();
            if(n %10 == 0)
            {
                System.out.println("You Entered a multiple of 10");
                break;
            }
            else{
                n=0;
            }
            i++;
        }
    }
    
}
