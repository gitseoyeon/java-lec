package lec17.annotation;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Overri {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
    }
}
