package lec12.anonymous;

interface Greeting {
    void greet();
}

public class Anonymous {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from the anonymous class");
            }
        };

        greeting.greet();
    }
}
