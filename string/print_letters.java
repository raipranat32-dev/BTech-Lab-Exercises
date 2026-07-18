public class print_letters {
    static void printLetters(String s)
    {
        for(int i=0 ; i<s.length();i++)
        {
            System.out.print(s.charAt(i)+" ");
        }
    }
    public static void main(String args[])
    {
      String str = args[0];
      printLetters(str);
    }
}