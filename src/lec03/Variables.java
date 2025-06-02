package lec03;

public class Variables {
    public static void main(String[] args) {
        int age = 25;
        System.out.println(age);

        age = 26;
        System.out.println(age);

        double salary = 50000.75;
        System.out.println(salary);

        String name = "민서연";
        System.out.println("name = " + name);
        System.out.println(name.length());


        int bonus = 500;
        int totalSalary = (int) salary + bonus; // casting
        System.out.println("totalSalary = " + totalSalary);
    }

}
