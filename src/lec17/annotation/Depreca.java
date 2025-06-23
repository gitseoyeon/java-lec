package lec17.annotation;

class Calculator {
    @Deprecated
    public int add(int a, int b) {
        return a + b;
    }

    public int addNumber(int a, int b) {
        return a + b;
    }
}
public class Depreca {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.addNumber(2, 4));
    }


}
