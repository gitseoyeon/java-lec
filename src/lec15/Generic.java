package lec15;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public <E> void printContent(E extraInfo) {
        System.out.println("Content: " + content + ", Extra: " + extraInfo);
    }
}

// 제너릭 메서드
class Box2 {
    public static <T> void displayArray(T[] array) {
        System.out.println("Print Array");
        for(T element : array){
            System.out.println(element);
        }
    }

    public static <T> void displayList(List<T> list) {
        System.out.println("Print List");
        for(T element : list) {
            System.out.println(element);
        }
    }
}

// 기존 생성자
class StringBox {
    private String content;

    public StringBox(String content) {
        this.content = content;
    }
}

public class Generic {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("안녕하세요?????????");
        System.out.println(stringBox.getContent());
        stringBox.setContent("실패!");
        System.out.println(stringBox.getContent());
        stringBox.printContent(123);

        Integer[] numbers  = {1,2,3,4,5};
        String[] words = {"apple", "banana", "cherry"};

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            list.add(i);
        }

        List<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("cherry");

        List<Integer> num = new ArrayList<>(List.of(1,2,3,4,5));
        num.add(6);
        num.remove(1);
        System.out.println(num);

        // static 함수기 때문에 인스턴스 생성 따로 안함
        Box2.displayArray(numbers);
        Box2.displayArray(words);
        Box2.displayList(list);
        Box2.displayList(wordList);

    }
}
