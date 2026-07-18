public class swap {
    static void swap(int x, int y){
        x = x^y;
        y=x^y;
        x=x^y;
        System.out.println(" After Swapping \n x: "+x+" and y: "+y);
    }
    public static void main()
    {
        System.out.println("Before swapping \n x:"+3+" and y: "+4);
        swap(3,4);
    }
}
