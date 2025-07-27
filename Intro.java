package OOPS;

public class Intro {
    public static void main(String[] args) {
        Student navdeep = new Student(92, "Navdeep", 98.3f);

        Student vamshi = new Student();

        // navdeep.roll = 92;
        // navdeep.name = "Navdeep";
        // navdeep.marks = 93.3f;

        navdeep.updateName("DSA Lover");
        navdeep.greeting();

        System.out.println(navdeep.roll);
        System.out.println(navdeep.name);
        System.out.println(navdeep.marks);

        System.out.println(vamshi.roll);
        System.out.println(vamshi.name);
        System.out.println(vamshi.marks);

        Student random = new Student("Random");

        Student random2 = random;
        System.out.println(random2.name); // even random2 points to the same object as random
    }
}

class Student {
    int roll;
    String name;
    float marks;

    void greeting () {
        System.out.println("hello this is " + this.name);
    }

    void updateName (String name) {
        this.name = name;
    }

    Student (String name) {
        this.name = name;
    }


    Student () {
        this (93, "Vamshi Krishna", 99.44f); // calling one constructor from other constructor
    }

    Student (int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
