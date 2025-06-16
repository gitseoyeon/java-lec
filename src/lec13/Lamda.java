package lec13;

import java.util.Arrays;

@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);

}

public class Lamda {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println(add.operate(5, 3)); // 8
        System.out.println(multiply.operate(5, 3)); // 15

        String[] animal = {"강아지", "고양이", "새", "토끼"};

        // for-each 문
        for(String a : animal) {
            System.out.println(a);
        }

        // 람다식
        Arrays.stream(animal).forEach(a -> System.out.println(a)); // animal: 배열, a: 배열 안 각각의 값

        Arrays.stream(animal).forEach(System.out::println); // 메서드 참조

    }
}
