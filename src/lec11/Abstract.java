package lec11;

abstract class Animal {
    abstract void makeSound();

    public void sleep() {
        System.out.println("ZZZ .... 자는 중.....");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("왈왈왕ㄹ왕ㄹ왈!!");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}
