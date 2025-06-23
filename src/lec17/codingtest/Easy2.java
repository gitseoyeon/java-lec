package lec17.codingtest;

public class Easy2 {

    public static int getProductAbs(int x, int y) {
        return Math.abs(x * y);
    }
    public static void main(String[] args) {
        System.out.println(getProductAbs(10, 20));
        System.out.println(getProductAbs(20, -40));
    }
}
