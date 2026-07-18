/*
Complexity:   O(n^2)
 */
public class max_subarray {
    public static void main(String[] args)
    {
        int arr[] = {1,-2,6,-1,3};
        int prr[] = new int[arr.length];
        int s=0;
        prr[0]=arr[0];
        int max = Integer.MIN_VALUE;
        for(int i =1;i<arr.length;i++)
        {
            prr[i] = prr[i-1] + arr[i];
        }
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
             s= (i == 0)?  prr[j]: prr[j]-prr[i];
            }
            if(max<s)
            {
                max = s;
            }
        }
        System.out.println("Maximum subarray sum is: "+max);
    }    
}
