import java.util.*;
public class trapping_rainwater{
    static int trapped_water(int arr[], int w)
    {
        int tw=0;
        int left_max[]=new int[arr.length];
        int right_max[]= new int[arr.length];
        left_max[0] = arr[0];
        right_max[arr.length-1] = arr[arr.length -1];
        for(int i=1;i<arr.length;i++) // LEFT MAX ARRAY
        {
            left_max[i] = Math.max(left_max[i-1],arr[i]);
        }
        for(int i=arr.length-2;i>=0;i--) // RIGHT MAX ARRAY
        {
            right_max[i] = Math.max(right_max[i+1],arr[i]);
        }
        for(int i=0;i<arr.length;i++) // trapped water calculation
        {
           tw += (Math.min(left_max[i],right_max[i])-arr[i])*w;
        }
        return tw;
    }
    public static void main(String[] args)
    {
      int height[] ={4,2,0,6,3,2,5};
      int w=1;
      //System.out.println("ENTER THE WIDTH OF EACH BAR");
      System.out.println("The Qunatity of Trapped  water is: "+trapped_water(height, w));
    }
}