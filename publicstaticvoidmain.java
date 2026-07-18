public class publicstaticvoidmain
{
  public static void main(String[] args)
  {
    if(args.length != 2)
    {
      System.out.println("Usage: java calc <num1> <num2");
      return;
    }
   
  try{
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    System.out.println("Sum: "+(a+b));
  }catch(NumberFormatException e){
    System.out.println("Error : Numbers Only");
  }
}
}
