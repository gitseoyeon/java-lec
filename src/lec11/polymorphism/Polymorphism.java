package lec11.polymorphism;

class Animal {
    public void makeSound() {
        System.out.println();
    }
}

class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("멍멍!!!!!!!!!!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("미야옹");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("짹!!!!!");
    }
}

class Horse extends Animal {
    @Override
    public void makeSound() {
        System.out.println("히이잉이잉");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2  = new Cat();
        Animal a3 = new Bird();
        Animal a4 = new Horse();

//        a1.makeSound();
//        a2.makeSound();
//        a3.makeSound();
//        a4.makeSound();

        Animal[] animals = {a1, a2, a3, a4};

        for(Animal animal : animals){
            animal.makeSound();
        }
    }
}
