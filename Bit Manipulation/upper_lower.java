public class upper_lower{
    public static void main()
    {
        for(char ch ='A'; ch<='Z'; ch ++)
        {
            System.out.print((char)(ch | ' '));
        }
    }
}