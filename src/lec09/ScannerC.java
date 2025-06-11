package lec09;

import java.util.Scanner;

public class ScannerC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String word = scanner.next();
        int num = scanner.nextInt();
        double num2 = scanner.nextDouble();
        char c = scanner.next().charAt(0);

        System.out.println("이름: " + name + ", next(): " + word +
                ", nextInt(): " + num + ", nextDouble():" + num2 + ", next().charAt: " + c);
    }
}
