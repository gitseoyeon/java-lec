package lec09;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요: ");
        int num1 = scanner.nextInt();
        System.out.print("숫자를 입력해주세요: ");
        int num2 = scanner.nextInt();
        System.out.print("연산자를 입력해주세요: ");
        char operate = scanner.next().charAt(0);
        int result = 0;

        switch (operate){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }else{
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("잘못된 연산 방식입니다.");
                return;
        }

        System.out.println("결과: " + result);

    }
}
