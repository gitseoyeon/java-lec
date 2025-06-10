package lec08;

class Person {
    String name;
    int age;

    public void sayHello() {
        System.out.println("안녕하세요. 저는 " + name + "입니다. " + "나이는 " + age + "살 입니다.");
    }

    public void study() {
        System.out.println("공부 하는 중....");
    }
}

class Car {
    String brand;
    int year;

    public void displayInfo() {
        System.out.println("브랜드명: " + brand + "연식: " + year);
    }
}

public class ClOb {
    public static void main(String[] args) {
        Person person = new Person(); // 객체 인스턴스
        person.name = "민서연";
        person.age = 100;

        person.sayHello();
        person.study();

        Car car = new Car();
        car.brand = "소나타";
        car.year = 2020;

        car.displayInfo();
    }
}
