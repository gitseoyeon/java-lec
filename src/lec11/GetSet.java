package lec11;

class Person {
    public String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ReadOnlyStudent {
    private final int score;

    public ReadOnlyStudent(int score){
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

public class GetSet {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "sy";
        person.setName("sy");
//        System.out.println(person.name);
        System.out.println(person.getName());

        // 읽기 전용
        ReadOnlyStudent ros = new ReadOnlyStudent(99);
        System.out.println(ros.getScore());
    }
}
