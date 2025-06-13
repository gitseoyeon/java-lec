package lec11.Two;

import lec11.One.Animal;

public class Dog extends Animal {
    public Dog() {
        System.out.println(Animal.publicField); // 다른 패키지 부모 클래스 접근 가능
        System.out.println(Animal.protectedField); // 다른 패키지 부모 클래스 접근 가능
//        System.out.println(Animal.privateField); // // 다른 패키지 부모 클래스 접근 불가능
//        System.out.println(Animal.defaultField); // 다른 패키지 부모 클래스 접근 가능

    }
}
