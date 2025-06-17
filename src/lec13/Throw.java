package lec13;

public class Throw {
    public static void main(String[] args) {
        String strNum = "123a";

        try {
            int num = convertToTint(strNum);

            System.out.println("반환 결과: " + num);
        }catch (NumberFormatException e) {
            System.out.println("숫자 형식 오류!");
        }

        String input = "100";

        try {
            validateTokenCount(input);

            System.out.println("숫자 두개");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        String test = "2,a43";
        try{
            int result = multiply(test);
            System.out.println(result);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("에러!");
        }
    }

    public static int convertToTint(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }

    // 조건 체크 후 throw
    public static void validateTokenCount(String tokens) throws NumberFormatException {
        if(tokens.length() != 2) {
            throw new NumberFormatException("숫자 2개가 아닙니다.");
        }
    }

    public static int multiply(String input) throws NumberFormatException {
        String[] splitInput = input.split(",");
        int[] results = new int[2];

        for(int i =0; i < splitInput.length; i++){
            results[i] = Integer.parseInt(splitInput[i]);
        }

        return results[0] * results[1];
    }
}
