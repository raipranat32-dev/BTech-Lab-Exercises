public class selection_sort{
    static void sort(int arr[])
    {
        for(int i=0; i<arr.length-2; i++)
        {
            int minpos=i;
            for(int j=i+1; j<=arr.length-1; j++)
            {
                if(arr[minpos] > arr[j])
                {
                    minpos= j;
                }
            }
            int temp = arr[minpos]; // swapping is done outside the inner loop
            arr[minpos]=arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String [] args)
    {
      int arr[] ={5,4,3,2,1};
        System.out.println("Unsorted array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sort(arr);
        System.out.println("\nSorted array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}