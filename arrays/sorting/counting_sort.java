import java.util.*;
public class counting_sort{
    static void count_sort(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            largest=Math.max(arr[i],largest);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0 ; i<count.length; i++)
        {
            while(count[i]>0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args)
    {
       int arr[] ={1,4,1,3,2,4,3,7};
        System.out.println("Unsorted array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        count_sort(arr);
        System.out.println("\nSorted array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}