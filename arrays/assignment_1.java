public class assignment_1 {
     static boolean check_replica(int arr[])
    {
        for(int i=0 ; i<arr.length; i++)
        {
            int c=0;
          for(int j = i+1;j<arr.length;j++)
          {
            if(arr[i] == arr[j])
                c++;
          }
          if(c>2 || c==0)
          {
            return false;
          }
          else
            continue;
        }
        return true;
    }
        public static void main(String[] args)
     {
            int arr[] = {1,1,1,3,3,4,3,2,4,2};
            System.out.println("Result is: "+check_replica(arr));  
    }
}
