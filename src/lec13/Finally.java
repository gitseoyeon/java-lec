package lec13;

public class Finally {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Divistion by zero.");
        } finally {
            System.out.println("Clear: This block always running.");
        }

        // 문자열 파싱
        String input = "123";

        try{
            int number = Integer.parseInt(input);

            System.out.println("Parse number: " + number);
        }catch (NumberFormatException e) {
            System.out.println("Error Unable to parse the input");
        } finally {
            System.out.println("Process completed.");
        }
    }
}
