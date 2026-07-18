public class power_Of_two_Or_not {
    static boolean check(int a)
    {
        if((a & (a-1) ) == 0)
            return true;
else return false;
    }
    public static void main()
    {
        int n=15;
        if( check(n))
        {
          
            System.out.println("It's a power of 2");
        }
        else
            System.out.println("It's not a power of 2");
    }
}
