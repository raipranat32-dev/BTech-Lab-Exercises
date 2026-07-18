public class anagram {
    static boolean check_anagram(String str, String s)
    {
        if(str.length() == s.length())
{        for(int i = 0; i < str.length(); i++)
        {
            int j=0;
          while (j<s.length())
          {
            if(s.charAt(j) == str.charAt(i))
            {
           j++; 
            break;
        }
    }
        }
        return true;
    }
    else 
    {
        return false;
    }
    }
    public static void main(String args[])
    {
        String str = "care";
        String s = "racn";
        if(check_anagram(str, s) == true)
            System.out.println("Strings are anagram");
        else 
            System.out.println("Strings are not anagram");
    }
}
