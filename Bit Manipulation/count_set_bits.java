public class count_set_bits {
    static int count(int n)
    {
        int count =0;
        while(n!=0)
        {
         if((n & 1) != 0)
            count ++;
          n= n >> 1;
        }
        return count;
    }
    public static void main()
    {
        int n=12;
        System.out.println("Number of bit pairs is: "+count(n));
    }
}
