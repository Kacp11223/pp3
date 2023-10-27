public class Student {
    String name, id;
    float aveGrade; 
    int age, semester;
    boolean isIdRight;
    void sayHello(){
        System.out.println("Hello from "+ name);
    }
    void displayName(){
        System.out.println("My name is "+ name);
    }
    void displayAge(){
        System.out.println("My age is "+ age);
    }
    void displayThings(){
        System.out.println("My name is " + name + " Im currently on " + semester + " semester and my grade is " + aveGrade);
    }
    void idReverse(){
        isIdRight = !isIdRight;
    }
    void displayId(){
        System.out.println("My name is " + name + " my id number is " + id + " and it's " + isIdRight);
    }

}


