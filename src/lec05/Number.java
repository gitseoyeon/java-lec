package lec05;

public class Number {
    public static void main(String[] args) {
        int number = 123;
        String binaryString = Integer.toBinaryString(number);
        String hexString = Integer.toHexString(number);

        System.out.println("Decimal: " + number); // 10진수
        System.out.println("Binary: " + binaryString); // 2진수
        System.out.println("Hexadecimal: "+ hexString); // 16진수
    }
}
