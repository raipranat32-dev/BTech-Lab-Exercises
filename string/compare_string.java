public class compare_string {
    public static void main(String args[])
    {
      String s1 = new String("Pranat");
      String s2 = new String("Pranat");
      if(s1 == s2)
        System.out.println("Equal strings");
    else System.out.println("stings are not equal");
    if(s1.equals(s2))
        System.out.println("Equal strings");
    else
        System.out.println("stings are not equal");
    }
    
}
/*    OUTPUT
   stings are not equal
   Equal strings
 */
