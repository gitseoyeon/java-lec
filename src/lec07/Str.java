package lec07;

public class Str {
    public static void main(String[] args) {
        String message = "Hello, Java!";

        System.out.println(message.length()); // 문자열 길이를 반환하는 메서드
        System.out.println(message.toUpperCase()); // 문자열을 대문자로 반환하는 메서드
        System.out.println(message.toLowerCase()); // 문자열을 소문자로 반환하는 메서드

        System.out.println(message.indexOf("l")); // 문자열의 위치를 반환하는 메서드
        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) == 'l'){
                System.out.println(i);
                break; // 겹치는 문자는 출력 안함
            }
        }

        System.out.println(message.substring(1)); // ello, Java!
        System.out.println(message.substring(2)); // llo, Java!

        String address = "0x120819f5573ac3A530e6172b1581613A09b4b338";
        System.out.println(address.substring(0, 7));

    }
}
