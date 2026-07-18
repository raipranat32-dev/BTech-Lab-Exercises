public class kadane {
    public static void main(String[] args)
    {
        int arr[] = {1,-2,6,-1,3};
        int cs =0;
        int ms = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++)
        {
            cs=arr[i] +cs;
            if(cs<0)
                cs=0;
            ms =Integer.max(ms,cs);
        }
        System.out.println("Maximum Subarray sum is: "+ms);
    }
    
}
