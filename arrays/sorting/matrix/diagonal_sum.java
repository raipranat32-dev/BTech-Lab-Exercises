public class diagonal_sum{
    static int dia_sum(int arr[][])
    {
        int pd=0, sd=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(i == j)
                    pd+=arr[i][j];
                if((i+j)== arr.length-1 && i!=j)
                    sd+=arr[i][j];
            }
        }
        return pd+sd;
    }
    public static void main(String[] args)
    {
       int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
       for(int i=0; i<mat.length; i++)
       {
        for(int j=0; j<mat[0].length; j++)
        {
          System.out.print(mat[i][j]+" ");
        }
        System.out.println();
       }
        System.out.println("\nDiagonal Sum is: "+dia_sum(mat)); 
    }
}