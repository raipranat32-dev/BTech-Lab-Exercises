import java.util.*;
public class OOPS{
    public static void main(){
        Scanner sc= new Scanner (System.in);
    pen linc = new pen();
    linc.setcolor("Red");
    System.out.println(linc.color);
    linc.setTip(5);
    System.out.println(linc.tip);
    Bankacc c1 = new Bankacc();
    c1.name="Pranat";
    int p;
    System.out.print("Enter your 4 digit password: ");
    p = sc.nextInt();
    c1.setPass(p); 
    System.out.println("Your password is: "+c1.getPass());
}
}
class Bankacc{
    String name;
    private int pass;
    void setPass(int pass)
    {
        this.pass = pass;
    }
    int getPass()
    {
        return this.pass;
    }
}
class pen {
     String color;
    int tip;
     void setcolor(String Newcolor)
     {
        color = Newcolor;
     }
     void setTip(int x)
     {
        tip = x;
     }
}
class student {
    String name;
    int age;
    float percentage;
    void calPer(int phy, int chem , int math)
    {
        percentage = (phy + chem + math)/3;
    }
}