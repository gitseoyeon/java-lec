package lec14;

import java.util.HashMap;
import java.util.Map;

public class Ma {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("사과", 17900);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        for(Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + "의 가격은 " + entry.getValue() + " 원 입니다.");
        }

        // 평균 계산
        int sum = 0;
        for(int fruitPrice : fruitPrices.values()){
            sum += fruitPrice;
        }
        System.out.println("가격 평균: " + sum / fruitPrices.size());

    }
}
