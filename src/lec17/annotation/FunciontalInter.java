package lec17.annotation;

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}
public class FunciontalInter {
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("Alice");
    }
}
