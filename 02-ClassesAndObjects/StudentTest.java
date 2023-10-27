public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        Student b = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        s.id = "04600";
        s.semester = 1;
        s.isIdRight = true;
        s.aveGrade = 4.5f;

        b.name = "Willie";
        b.age = 23;
        b.id = "88328";
        b.semester = 3;
        b.isIdRight = false;
        b.aveGrade = 2.5f;


        s.sayHello();
        s.displayName();
        s.displayAge();
        s.displayThings();
        s.idReverse();
        s.displayId();

        b.sayHello();
        b.displayName();
        b.displayAge();  
        b.displayThings();
        b.idReverse();
        b.displayId();      


        System.out.println(s.name + " " + s.age);
        System.out.println(b.name + " " + b.age);
    }
}