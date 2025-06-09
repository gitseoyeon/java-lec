package lec07;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        for(int i = 0 ; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }

        int[] arr = {2,4,6,8,10};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
