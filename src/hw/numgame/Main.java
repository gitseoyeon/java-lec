package hw.numgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean isCollect;
    static int answer, cnt;
    public static void main(String[] args) throws IOException {
        System.out.println("======== 🔍 숫자 맞추기 게임 ========");
        answer = (int)(Math.random() * 100) + 1;
        isCollect = false;
        cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(answer);

        while(true) {
            System.out.print("1-100 사이의 숫자 입력 👉🏻 ");
            int input = Integer.parseInt(br.readLine());
            cnt += 1;
            checkNumber(input);
            if(isCollect){
                break;
            }else{
                if(input <= 0 || input > 100){
                    System.out.println("🚫 1-100 사이 수를 입력해주세요.");
                    cnt -= 1;
                    continue;
                }
                getHint(input);
            }
        }
        System.out.println("👏🏻 정답입니다! 답은: " + answer + " 입니다. " + cnt + "번 만에 맞추셨네요 👀");
    }

    public static void checkNumber(int num) {
        if(answer == num) isCollect = true;
    }

    public static void getHint(int num) {
        if(num > answer){
            System.out.println("❌ 틀렸습니다. 입력하신 수보다 작은 수 입니다. 시도 횟수: " + cnt + "번");
        }else if(num < answer) {
            System.out.println("❌ 틀렸습니다. 입력하신 수보다 큰 수 입니다. 시도 횟수: " + cnt + "번");
        }
    }
}
