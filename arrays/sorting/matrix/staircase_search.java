public class staircase_search {
    static boolean stair_search(int arr[][],int key)
    {
        int row = 0;
        int col = arr[0].length-1;
        while(row<arr.length && col>0)
        {
            if(arr[row][col] == key)
            {
                System.out.println("\nElement present at index ("+row+", "+col+")");
                return true;
            }
            else if(arr[row][col]>key)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("\nElement not present");
        return false;
    }
    public static void main(String args[])
    {
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int ns = 45;
          for(int i=0; i<arr.length; i++)
       {
        for(int j=0; j<arr[0].length; j++)
        {
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
       stair_search( arr,ns );
    }    
}
