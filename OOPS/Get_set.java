public class Get_set {
    public static void main(String args[])
    {
    pen p1 = new pen();
    pen p2 = new pen();
    p1.setcolor("Blue");
    p1.setTip(10);
    p2.setcolor("Red");
    p2.setTip(20);
    System.out.println("Tip size is: "+p2.getTip());
    System.out.println("Pen color is: "+p2.getcolor()); 
   }
}
class pen {
    private   String color;
     private int tip;
     void setcolor(String Newcolor)
     {
        this.color = Newcolor;
     }
     void setTip(int x)
     {
        this.tip = x;
     }
     String getcolor()
     {
       return this.color;
     }
     int getTip()
     {
        return this.tip;
     }
}
