package lec08;
class Human {
    String name;
    int age;

    public Human(String name, int age) { // 생성자
        this.name = name;
        this.age = age;
    }

    public void hello() {
        System.out.println("hello");
    }
}
public class Constructor {
    public static void main(String[] args) {
        Human human = new Human("sy", 20);

    }
}
