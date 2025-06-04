package lec05;

public class Loop_for {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        // 1
        // 2
        // 3
        // 4
        // 5

        for(int i = 10; i > 1; i--){
            System.out.print(i + ", ");
        }
        System.out.println(1);
        // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1


        // 구구단 출력
        int number = 5;
        for(int i = 1; i < 10; i++){
            System.out.println(number + "X" + i + " = " +(number * i));
        }

        number = 9;
        for(int i = 1; i < 10; i++){
            System.out.println(number + "X" + i + " = " +(number * i));
        }

        // 반복문과 조건문 같이 사용
        number = 5;

        for (int i = 1; i <= 19; i++) {
            if(i >= 5){
                System.out.println(number + "X" + i + " = " + (number * i));
            }
        }

        // 짝수만 출력

        // 방법1
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        // 방법2
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        // 3의 배수 출력
        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }

        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }
    }
}
