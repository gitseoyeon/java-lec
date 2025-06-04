package lec05;

public class Logical {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if(age >= 18 && hasID) { // true
            System.out.println("접속 가능");
        }

        boolean isWeekend = false;
        boolean isHolidy = true;

        if(isWeekend || isHolidy){ // true
            System.out.println("쉴 수 있습니다.");
        }

        boolean isRaining = true;
        if(!isRaining){
            System.out.println("비가 안옵니다.");
        }else{
            System.out.println("비가 옵니다.");
        }
    }
}
