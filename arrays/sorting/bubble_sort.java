public class bubble_sort{
    static void sort(int arr[])
    {
      for(int i=0;i<arr.length-1;i++)
      {
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j]>arr[j+1])            // swapping is done inside inner loop
            { 
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
      }
    } 
    public static void main(String[] args) {
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