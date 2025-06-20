package lec16.stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        int result = numbers.stream()
//                .filter((n) -> n % 2 == 0)
//                .mapToInt(Integer::intValue)
//                .sum();

        int result = 0;
        for(int n : numbers) {
            if(n % 2 == 0) {
                result += n;
            }
        }

        System.out.println(result);

        List<Double> value = Arrays.asList(10.0, 20.0, 30.0);

        double avg = value.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0); // 안전 장치

        System.out.println(avg);
    }
}
