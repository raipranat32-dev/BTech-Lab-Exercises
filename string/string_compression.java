public class string_compression {
    static String compressor(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++)
        {
            int count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
              count++;
              i++;
            }
            if(count>1)
            {
            sb.append(str.charAt(i));
            sb.append(count);
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[])
    {
      String s = args[0];
      System.out.println("Compressed String is: "+compressor(s));
    }
}
