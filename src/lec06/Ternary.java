package lec06;

public class Ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;

        // 삼항 연산자 활용
        int max = (a > b) ? a : b;
        System.out.println(max);

        // if문 활용
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        int score = 61;

        String result = (score > 60) ? "통과" : "털락";
        System.out.println("결과: " + result);

        if(score > 60){
            result = "통과";
            System.out.println("결과: " + result);
        }else{
            result = "탈락";
            System.out.println("결과: " + result);
        }

        // 가독성이 떨어지는 중첩된 삼항 연산자
        String color = "빨강";
        String choiceColor = (color == "빨강") ? "빨강" : (color == "파랑") ? "파랑" : "보라";

        System.out.println(choiceColor);
    }
}
