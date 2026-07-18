import java.util.*;
public class reverseanarray {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<10;i++)
        {
           arr[i] = sc.nextInt();
        }
        System.out.println("original Array");
        for(int i=0; i<10;i++)
        {
            System.out.print(" "+arr[i]);
        }
        for(int i=0, j=9; i<j;i++,j--)
        {
             int t= arr[i];
             arr[i]=arr[j];
             arr[j]=t;
        }
        System.out.println("\nReversed Array");
          for(int i=0; i<10;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
