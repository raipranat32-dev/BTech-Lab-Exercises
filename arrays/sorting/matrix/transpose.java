public class transpose {
    public static void main(String [] args)
    {
        int arr[][] = {{10,20,30},{15,25,45}};
        int transpose[][] = new int[arr[0].length][arr.length];
         for(int i=0; i<arr.length; i++)
       {
        for(int j=0; j<arr[0].length; j++)
        {
            transpose[j][i] = arr[i][j];
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
        for(int i=0 ; i<transpose.length; i++)
            {
            for(int j=0 ; j< transpose[0].length; j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
