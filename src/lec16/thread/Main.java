package lec16.thread;

import java.util.Timer;

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println("My Thread: " + i);

            try{
                Thread.sleep(5000);
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        thread.run();
        System.out.println("막지마");
        Timer t = new Timer();

        System.out.println("일어나라");
        thread.interrupt();
    }
}
