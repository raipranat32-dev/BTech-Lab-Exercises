public class spiral_matrix{
    static void spiral(int arr[][])
    {
        int s_row=0, e_row=arr.length-1, s_col=0,end_col=arr[0].length-1;
        while(s_row<=e_row && s_col<=end_col)
        {
            // top
            for(int j=s_col;j<=end_col;j++)
            {
             System.out.print(arr[s_row][j]+" ");
            }
            // right
            for(int i=s_row;i<e_row;i++)
            {
              System.out.print(arr[i][end_col]+" ");
            }
            // bottom
            for(int j=end_col;j>=s_col;j--)
            {
                if(s_row==e_row)
                    break;
              System.out.print(arr[e_row][j]+" ");
            }
            // left
            for(int i=e_row-1;i>s_row;i--)
            {
                if(s_col == end_col)
                    break;
                System.out.print(arr[i][s_col]+" ");
            }
            s_col++;
            s_row++;
            e_row--;
            end_col--;       
         }
         System.out.println();
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(arr);  
    }
}
// output
// 1 2 3 4 4 8 12 16 15 14 13 9 5 6 7 7 11 10