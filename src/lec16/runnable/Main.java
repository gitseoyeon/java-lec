package lec16.runnable;
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable 실행 중");

        for(int i = 1; i <= 5; i++) {
            try{
                Thread.sleep(5000);
                System.out.println(i);
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "CountThread");

        thread.setName("고장 없이 잘 돌아가는 스레드");

        thread.start();

        // 람다식으로 작성하기
        new Thread(() -> {
            System.out.println("Runnable 실행 중");

            for(int i = 1; i <= 5; i++) {
                try{
                    Thread.sleep(5000);
                    System.out.println(i);
                }catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }).start();
    }
}