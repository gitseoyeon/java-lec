package lec17.codingtest;

public class Easy3 {
    public static  int getDivisorSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getDivisorSum(12));
        System.out.println(getDivisorSum(5));
    }
}
