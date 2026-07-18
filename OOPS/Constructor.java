public class Constructor {
    public static void main(){
 Student s1 = new Student("Pranat",50);
  System.out.println(s1.name);
  System.out.println(s1.rollno);
}
}
class Student{
    String name;
    int rollno;
    Student(String name, int rollno)
    {
        System.out.println("Contructor is invoked ....");
        this.name= name;
        this.rollno = rollno;
    }
}
