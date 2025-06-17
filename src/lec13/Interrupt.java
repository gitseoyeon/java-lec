package lec13;

public class Interrupt {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            try{
                System.out.println("Worker: 작업 시작");

                Thread.sleep(10_000);
                System.out.println("Worker: 작업 완료");
            } catch (InterruptedException e) {
                System.out.println("Worker: 중단 신호 수신, 정리 작업 후 종료");
            }
        });
    }
}
