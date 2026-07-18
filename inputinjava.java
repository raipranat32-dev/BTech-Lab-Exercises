import java.util.*;
/**
 * @author Pranat
 * @version 1.0
 */
public class inputinjava {
   /**
    * 
    * @param  A to store Integer Value
    * @param w to store a word
    * @param l to store a line
    * @param f to store a floating value
    * @param d to store a double value
    * @param b to store a boolean value
    * @param s to store a short value
    * @param L to store a Long Value
    * @return the passes value of each data type
    */
    public static void main(String []args)
{    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an Integer");
    int a = sc.nextInt();
    System.out.println("Enter a Word");
    String w = sc.next();
    sc.nextLine();
     System.out.println(" Enter a Sentence");
    String l = sc.nextLine();
     System.out.println(" Enter a decimal");
    float f = sc.nextFloat();
     System.out.println("Enter a decimal");
    double d = sc.nextDouble();
     System.out.println("Enter a boolean value");
    boolean b = sc.nextBoolean();
     System.out.println("Enter a Short value");
    short s= sc.nextShort();
     System.out.println("Enter a Long Value");
    long L= sc.nextLong();
    System.out.println("A: "+a);
    System.out.println("w: "+w);
    System.out.println("l: "+l);
    System.out.println("f: "+f);
    System.out.println("d: "+d);
    System.out.println("b: "+b);
    System.out.println("s: "+s);
    System.out.println("L: "+L);
}
}
/**
 * OUTPUT
 * Enter an Integer
23
Enter a Word
Pranat
 Enter a Sentence
I live in Lucknow
 Enter a decimal
34.5
Enter a decimal
23.4567
Enter a boolean value
true
Enter a Short value
2
Enter a Long Value
23456723456790
A: 23
w: Pranat
l: I live in Lucknow
f: 34.5
d: 23.4567
b: true
s: 2
L: 23456723456790
 */