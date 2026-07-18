public class ConstructorOverloading {
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student("Pranat");
        Student s3 = new Student(50);
        Student s4 = new Student("Pranat", 50);
        System.out.println("Name is: "+s2.name);
        System.out.println("Rollno. is: "+s3.roll);
        System.out.println("Name: "+s4.name+" Roll number: "+s4.roll);
    }
}
class Student{
    String name;
    int roll;
    Student() // non-=arameterized constructor
    {
        System.out.println("Non parameterised constructor is invoked..");
    }
    Student(String name)// parameterized constructor
    {
         System.out.println("Parameterised constructor (String) is invoked..");
        this.name= name;
    }
    Student(int roll) // parametrized constructor
    {
        System.out.println("Parameterised constructor (int) is invoked..");
        this.roll = roll;
    }
    Student(String name, int roll) // parametrized constructor
    {
        System.out.println("Parameterised constructor (String)+(int) is invoked..");
        this.name = name;
        this.roll = roll;
    }
}