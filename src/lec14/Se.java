package lec14;

import java.util.*;

public class Se {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("Kiwi");
        fruits.add("kiwi");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        for(String fruit : fruits) {
            System.out.println(fruit.hashCode()); // 저장 위치 출력
        }

        List<String> listFruits = new ArrayList<>(); // 중복 허용
        listFruits.add("Apple");
        listFruits.add("Apple");

        Set<String> linkedHash = new LinkedHashSet<>();
        linkedHash.add("b");
        linkedHash.add("a");
        linkedHash.add("c");

        for(String h : linkedHash) {
            System.out.println(h);
        }

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");

        for(String t : treeSet) {
            System.out.println(t);
        }

    }
}
