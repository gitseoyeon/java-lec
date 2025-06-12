package lec10;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("이름: " + name);
    }
}

class Dog extends Animal {
    String breed;
    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    @Override
    public void printName(){
        System.out.println(name+ " " + breed);
    }
}

public class Over {
    public static void main(String[] args) {
        Dog dog = new Dog("강아지", "푸들");
        Animal animal = new Animal("고양이");
        dog.printName();
        animal.printName();
    }
}
