import java.util.Collections;
import java.util.Arrays;
public class inbuilt_sort_reverse {
    public static void main(String [] args)
    {
       Integer []arr = {1,2,3,4,5};
        System.out.println("Unsorted array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("\nSorted array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
