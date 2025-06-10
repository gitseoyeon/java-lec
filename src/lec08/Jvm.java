package lec08;

public class Jvm {
    public static void main(String[] args) {
        P p = new P();
        p.sayHello();

        P.sayGeneralGreeting();
    }
}

class P {
    String name = "Alice";
    static String species = "Human";
    void sayHello() {
        String message = "Hello, my name is " + name;
        System.out.println(message);
    }

    static void sayGeneralGreeting() {
        String msg = "Hello! We are " + species + "s.";
        System.out.println(msg);
    }
}