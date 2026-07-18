/**
     * @author Pranat
     * @param arr[]: to store prices array
     * @param p: to store volatile profit
     * @param p_max: to store maximum profit
     */
public class sell_stocks {
    static int max_profit(int arr[])
    {
        int bp = arr[0];
        int p_max = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
        if(bp<arr[i])
        {
            int p = arr[i] - bp;
        p_max = Math.max(p_max,p);
        }
        else 
        {
            bp = arr[i];
        }
    }
            return p_max;
    }
    public static void main(String[] args)
    {
       int prices[] = {7,1,5,3,6,4};
       System.out.println("Maximum Profit is: "+max_profit(prices));
    }
    
}
