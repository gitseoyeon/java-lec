package lec06;

public class Encoding {
    public static void main(String[] args) {
        char asciiChar = 'A';
        System.out.println("Character: " + asciiChar);

        int asciiCode = (int) asciiChar;
        System.out.println("ASCII Code: " + asciiCode); // A 문자를 아스키코드로 변환

        char koreanChar = '가';
        System.out.println("Character: " + koreanChar); // Character: 가

        int unicodeCode = (int) koreanChar;
        System.out.println("Unicode Code: U+" + Integer.toHexString(unicodeCode).toUpperCase()); // Unicode Code: U+AC00
    }
}
