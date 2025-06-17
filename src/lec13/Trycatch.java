package lec13;

class Util {
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

@FunctionalInterface
interface  A {
    public void say(String name);
}

public class Trycatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // 에러 메세지

            System.out.println("Error: Division by zero."); // 에러 메세지 직접 작성 가능
        }

        // 메소드 참조 활용
        A a2 = Util::sayHello;

        a2.say("sy");

        String input = "123";

        try {
            int number = Integer.parseInt(input);
            System.out.println("당신이 입력한 숫자는 " + number + " 입니다.");
        } catch (NumberFormatException e) {
            System.out.println("숫자 포맷이 아닙니다.");
        }
    }
}
