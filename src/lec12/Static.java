package lec12;

class Person {
    static void greet() {
        System.out.println("안녕하세요(static 메소드)");
    }

    void sayHello(){
        System.out.println("안녕하세요(일반 메소드)");
    }
}

public class Static {
    public static void main(String[] args) {
        Person.greet(); // 클래스로 접근

        Person p = new Person();
        p.sayHello(); // 객체로 접근
    }
}
