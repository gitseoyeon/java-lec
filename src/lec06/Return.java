package lec06;

public class Return {
    public static int addNumber(int a, int b){
        int result = a + b;
        return result;
    }
    public static void main(String[] args) {
        int number = addNumber(10, 7);
        System.out.println(number);
    }
}
