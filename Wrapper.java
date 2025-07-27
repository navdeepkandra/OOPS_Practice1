package OOPS;

public class Wrapper {
    public static void main(String[] args) {
        int a = 45;
        int b = 10;

        Integer num1 = 50;
        Integer num2 = 40;

        //demonstration of not swapping in primitive data types since the variables use pass by value;
        swap (a, b);
        System.out.println(a + " " + b);

        //demonstration of not swapping in Integer wrapper class since it has final keyword behind;
        swapWrapper (num1, num2);
        System.out.println(num1 + " " + num2);

        final A obj1 = new A("Navdeep");



        obj1.name = "hello"; // if final keyword used with object the value of object can be changed but not assigned to other object like

        // obj1 = new A("Vamshi");

        demo nav = new demo("Akki");

        //demonstration of how objects are destroyed by garbage collector automatically in Java if they are not referenced anymore.
        for(int i=0; i<10000000; i++) {
            nav = new demo("Akki");
        }
        
        
    }

    static void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swapWrapper (Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int sal = 4000;
    String name;

    A (String name) {
        this.name = name;
    }
}

class demo {
    String name;

    demo (String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
