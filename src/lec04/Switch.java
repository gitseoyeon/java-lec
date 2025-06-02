package lec04;

public class Switch {
    public static void main(String[] args) {
        String mood = "happy";

//        switch (mood) {
//            case "happy":
//                System.out.println("나는 행복합니다.");
//                break;
//            case "tired":
//                System.out.println("나는 피곤합니다...........");
//                break;
//            case "angry":
//                System.out.println("나는 화가납니다");
//                break;
//            case "sad":
//                System.out.println("나는 슬픕니다");
//                break;
//            default:
//                System.out.println("그냥 그래요");
//        }

        // if문으로 변환
        if(mood == "happy"){
            System.out.println("행복해요");
        } else if (mood == "tired") {
            System.out.println("힘들어요");
        } else if(mood == "angry"){
            System.out.println("열받아요");
        }else if(mood == "sad"){
            System.out.println("슬퍼요");
        }else{
            System.out.println("그냥 그래요");
        }
    }
}
