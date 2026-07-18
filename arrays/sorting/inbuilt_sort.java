import java.util.Arrays;
public class inbuilt_sort {
    public static void main(String [] args)
    {
         int arr[] ={5,4,3,2,1};
        System.out.println("Unsorted array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println("\nSorted array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
