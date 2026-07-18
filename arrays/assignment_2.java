public class assignment_2 {
    static int bin_search(int arr[], int u, int l, int ns)
    {
          for(int i=0 ; i<arr.length; i++)
           {
              int mid = (u+l)/2;
                if (ns == arr[mid])
                 {
                   return mid;
                 }
                else if(ns > arr[mid])
                 {
                  l=mid+1;
                 }
                else
                 {
                  u=mid-1;
                 }
           }
           return -1;
    }
    public static void main(String[] args)
    {
       int arr []  = {1};
       int target = 0;
       System.out.println("Result after searching is: "+bin_search(arr,0,arr.length-1,target));
    }
    
}
