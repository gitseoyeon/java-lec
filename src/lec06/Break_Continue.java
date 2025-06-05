package lec06;

public class Break_Continue {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i == 7){
                break;
            }
            System.out.println(i); // 1부터 6까지 출력
        }

        for(int i = 1; i <= 10; i++){
            if(i % 3 != 0){ // 3의 배수가 아닐 경우 건너뛰기
                continue;
            }
            System.out.println(i);
        }

        for(int i = 1; i <= 20; i++){
            if(i % 5 == 0) {
                continue;
            }
            if(i >= 15) {
                break;
            }
            System.out.println(i);
        }
    }
}
