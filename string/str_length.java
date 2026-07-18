public class str_length {
    public static void main(String [] args)
    {
        String st= args[0];
        String str = new String("Original");
        System.out.println("The length of string entered via command line argument method is: "+st.length());
        System.out.println("The length of string entered via string object method is: "+str.length());
    }
}
