package lec11.Two;

import lec11.One.Animal;

public class Person {
    public Person () {
        System.out.println(Animal.publicField); // 외부 클래스 접근 가능
//        System.out.println(Animal.privateField); // 외부 클래스 접근 불가능
//        System.out.println(Animal.defualtField); // 외부 클래스 접근 불가능
//        System.out.println(Animal.protectedField); // 외부 클래스 접근 불가능
    }
}
