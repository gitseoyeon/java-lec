package lec05;

public class Loop_while {
    public static void main(String[] args) {
        int i = 0;

        while(i < 5){
            System.out.println(i);
            i++;
        }

        boolean a = false;
        while(a) {
            System.out.println("무한 루프");
        }
        do{
            System.out.println("무한 루프");
        } while(a);

        int b = 0;
        while(b < 5){
            System.out.println("무한 루프");
            b++;
        }

        boolean c = true;
        int d = 1;

        while(c){
            System.out.println(d);
            d++;

            if(d > 10000){
                c = false;
            }
        }


        int input = 1;
        do{
            System.out.println("안녕하세요 자판기 입니다.");

            switch (input){
                case 1:
                    System.out.println("콜라");
                    break;
                case 2:
                    System.out.println("사이다");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                default:
                    System.out.println("잘못 골랐다");
            }
            input = 0;
        } while(input != 0);
    }
}
