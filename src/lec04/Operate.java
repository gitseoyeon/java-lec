package lec04;

public class Operate {
    public static void main(String[] args) {
       int a = 10;
       int b = 3;

//        System.out.println("a + b = " + (a + b));
//
//        int difference = a - b;
//        System.out.println(difference);
//
//        int product = a * b;
//        System.out.println(product);
//
//        int quotient = a / b;
//        System.out.println(quotient);
//
//        int remainder = a % b;
//        System.out.println(remainder);

        // 복합 연산자
        a += 5; // a = a + 5
        System.out.println(a);

        b -= 1;
        System.out.println(b); // 2

        b *= 4;
        System.out.println(b); // 8

        b /= 3;
        System.out.println(b); // 2

        b %= 2;
        System.out.println(b); // 0
    }
}
