public class palindrome_string {
    static boolean check_pal(String s){
        for(int i=0 ; i<s.length()/2 ; i++)
        {
          if(s.charAt(i) != s.charAt(s.length()-i-1))
            return false;
        }
        
        return true;
    }
    public static void main(String args[])
    {
        String s= args[0];
        if(check_pal(s.toUpperCase()) == true)
        {
            System.out.println("It's Palindrome");
        }
        else{
            System.out.println("It's not Palindrome");
        }
    }
    
}
