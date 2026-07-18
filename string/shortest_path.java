public class shortest_path{
    static double path_length(String s)
    {
        double x = 0 , y=0;
        for(int i=0 ; i<s.length(); i++)
        {
          if(s.charAt(i) == 'N')
            y++;
        else if (s.charAt(i) == 'S')
           y--;
           else if (s.charAt(i) == 'E')
           x++;
        else 
            x--;

        }
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public static void main(String args[]){
        String dir = "WNEENESENNN";
     System.out.println("Shortest Path length is: "+path_length(dir));
    }
}