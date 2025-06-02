package lec04;

public class Constant {
    public static void main(String[] args) {
        int v = 10;
        System.out.println("v: " + v);

        v = 11;
        System.out.println("v: " + v);

        final int c = 10;
        System.out.println("c: " + c);

//        b = 11; // 에러 발생

        final int DAYS_IN_WEEK = 7; // 네이밍 규칙을 지킨 상수


    }
}
