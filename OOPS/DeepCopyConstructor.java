public class DeepCopyConstructor {
     public static void main(){
    Student s1 = new Student(50, 1720, "Pranat");
    s1.marks[0]=100;
    s1.marks[1]=90;
    s1.marks[2]=80;
    Student s2 = new Student(s1);
    System.out.print("s1 name: "+s1.name+"\ns1 roll: "+s1.roll+"\ns1 pass: "+s1.pass);
    for(int i=0 ; i<3; i++)
    {
        System.out.print("\n"+s1.marks[i]+" ");
    }
    s2.pass= 6969;
    s1.marks[0] = 23;
    System.out.print("\ns2 name: "+s2.name+"\ns2 roll: "+s2.roll+"\ns2 pass: "+s2.pass);
    for(int i=0; i<3; i++)
    {
        System.out.print("\n"+s2.marks[i]);
    }    
}
}
class Student{
    String name;
    int roll;
    int pass;
    int marks[];
    Student(Student s1) // COPY CONSTRUCTOR
    {
     this.name= s1.name;
     this.roll = s1.roll;
     this.pass = s1.pass;
     for(int i=0 ; i<3 ; i++)
     {
       this.marks= s1.marks;
     }
    }
    Student(int roll, int pass , String name){
         this.marks = new int[3];
        this.roll =roll;
        this.name= name;
        this.pass= pass;
    }
}


