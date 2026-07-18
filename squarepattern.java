public class squarepattern {
    public static void main(String [] args)
    {
        int t=1;
        while(t<=16)
        {
            System.out.print(" * ");
            if(t%4 == 0)
            {
                System.out.print("\n");
            }
            t++;
        }
    }
    
}
