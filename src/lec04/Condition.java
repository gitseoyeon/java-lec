package lec04;

public class Condition {
    public static void main(String[] args) {
        int number = 5;

        // if문
        if(number > 0){
            System.out.println("number는 0보다 큽니다.");
        }

        if(number >= 5){
            System.out.println("number는 5 이상입니다.");
        }

        // if-else 문
        int number2 = -1;
        if(number2 > 0) {
            System.out.println("number는 0보다 큽니다.");
        }else{
            System.out.println("number는 0이거나 0보다 작습니다.");
        }

        // if-else if-else 문
        int number3 = -1;
        if(number3 > 0){
            System.out.println("number는 양수입니다.");
        } else if(number3 < 0) {
            System.out.println("number는 음수입니다.");
        }else{
            System.out.println("number는 0 입니다.");
        }
    }
}
