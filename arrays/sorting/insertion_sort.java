public class insertion_sort{
    static void sort(int arr[])
    {
        for(int i=1; i<arr.length;i++)
        {
            int crr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>crr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = crr;
        }
    }
    public static void main(String [] args)
    {
         int arr[] ={5,4,3,1,2};
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
