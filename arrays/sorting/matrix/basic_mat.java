import java.util.*;
public class basic_mat{
static void min_max(int arr[][])
{
    int max=Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
      int r= arr.length, c = arr[0].length;
      for(int i=0 ; i<r; i++)
      {
        for(int j=0;j<c;j++)
        {
            max = Math.max(max,arr[i][j]);
            min = Math.min(min,arr[i][j]);
        }
      }
      System.out.println("Maximum Element in the matrix is"+max);
      System.out.println("Minimum Element in the matrix is"+min);
}
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int matrix[][] = new int[3][3];
      int r= matrix.length, ns = 5,c = matrix[0].length;
      System.out.println("Enter the elements of the matrix");
      for(int i=0 ;i<r;i++)
      {
        for(int j=0; j<c; j++)
        {
          matrix[i][j]=sc.nextInt();
        }
      }
      min_max(matrix);
     }
}
