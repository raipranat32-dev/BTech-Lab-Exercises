import java.util.*;
public class max_subarray_sum {
    public static void main(String[] args)
    {
      int arr[] = {1,-2,6,-1,3};
      int max = Integer.MIN_VALUE;
      for(int i=0; i<arr.length;i++) // i<(5)
      {
       // int s=0; // (1)
        for(int j=i;j<arr.length;j++) // j<5
        {
          int s=0;
            for(int k=i;k<=j;k++)
            {
              s+=arr[k];
            }
            if(max<s)
                max=s;
        }
      }
      System.out.println("Maximum subarray sum: "+max);
    }
}
