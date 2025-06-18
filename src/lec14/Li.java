package lec14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Li {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Coconut");
        fruits.add("Banana");

        // 오름차순 정렬
        Collections.sort(fruits);

        // 리스트 크기 조회
        for(int i  = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        // for-each 활용
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // 값 여부 확인
        if(fruits.contains("Apple")){
            System.out.println("Apple은 포함되어 있습니다.");
        }
        if(fruits.contains("Kiwi")){
            System.out.println("Kiwi는 포함되어 있습니다.");
        }

        // 값 삭제
        fruits.remove("Apple");
        fruits.remove(2);

        fruits.clear();

        System.out.println(fruits.isEmpty());
    }
}
