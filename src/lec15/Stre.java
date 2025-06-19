package lec15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stre {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = numbers.stream(); // 기본 생성
        numbers.stream().filter((n) -> n % 2 == 0); // 2, 4

    }
}
