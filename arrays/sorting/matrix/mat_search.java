public class mat_search {
   static  int bin_seach(int arr[],int s,int u,int l,int ns)
{
    int mid;
  for(int i=0 ;i<s;i++)
  {
    mid = (u+l)/2;
    if(arr[mid] == ns)
    {
        return 1;
    }
    if(arr[mid]<ns)
    {
        l=mid+1;
    }
    if(arr[mid] > ns)
    {
        u=mid-1;
    }
  }
  return 0;
}
   public static void main(String [] args)
   {
    int arr[][] = {{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
    int ns=97,check=0;
     for(int i=0 ; i<arr.length; i++)
     {
         check = bin_seach(arr[i],arr[i].length-1,i,0,ns);
         if(check == 1)
            break;
        else 
            continue;
     }
     if(check==1)
        System.out.println("Element Present");
    else 
        System.out.println("Element not Present");
   } 
}
