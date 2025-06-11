package lec09;

import java.util.Scanner;

public class Ja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🧃자판기 메뉴 🧃");
        System.out.println("1. 립톤 아이스티 (2000원)");
        System.out.println("2. 알로에킹 (2500원)");
        System.out.println("3. 복숭아 홍차 (1500원)");
        System.out.println("4. 코카콜라 (2000원)");

        int choice = scanner.nextInt();
        int price = 0;
        String item = "";
        final int ICETEA = 2000;
        final int ALOE = 2500;
        final int PEACH = 1500;
        final int COCACOLA = 2000;

        switch (choice) {
            case 1:
                item = "립톤 아이스티";
                price = ICETEA;
                break;
            case 2:
                item = "알로에킹";
                price = ALOE;
                break;
            case 3:
                item = "복숭아홍차";
                price = PEACH;
                break;
            case 4:
                item = "코카콜라";
                price = COCACOLA;
                break;
            default:
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                return;
        }

        System.out.println(item + " 선택 완료");
        System.out.println("내실 금액은 " + price + "원 입니다.");


        int money = 0;
        // money와 price를 비교
        while(true){
            System.out.print("금액을 넣어주세요: ");
            money += scanner.nextInt();
            if(money >= price){
                int change = money - price;
                System.out.println("결제가 완료되었습니다. 잔돈은 " + change + "원 입니다.");
                break;
            }else{
                System.out.println("잔액이 부족합니다. 돈을 더 넣어주세요.");
            }
        }
        System.out.println("🙇🏻‍ 감사합니다.");
    }
}
