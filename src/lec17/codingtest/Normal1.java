package lec17.codingtest;

import java.util.ArrayList;
import java.util.List;

public class Normal1 {
    public static boolean checkBrackets(String s) {
        String[] arr = s.split("");
        List<String> list = new ArrayList<>();

        for(String str : arr) {
            if(str.equals("{") || str.equals("(") || str.equals("[")) {
                list.add(str);
            }else{
                if(str.equals("}")){
                    if(list.get(list.size() - 1).equals("{")){
                        list.remove(list.size() - 1);
                    }else{
                        return false;
                    }
                }else if(str.equals(")")) {
                    if(list.get(list.size() - 1).equals("(")) {
                        list.remove(list.size() - 1);
                    }else {
                        return false;
                    }
                } else if(str.equals("]")) {
                    if(list.get(list.size() - 1).equals("[")) {
                        list.remove(list.size() - 1);
                    }else{
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkBrackets("()[]{}"));
        System.out.println(checkBrackets("([{}])"));
        System.out.println(checkBrackets("(]"));
        System.out.println(checkBrackets("([)]"));
    }
}
