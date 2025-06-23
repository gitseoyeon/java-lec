package lec17.annotation;

public class SupressWarn {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        java.util.List list = new java.util.ArrayList<>();
        list.add("Hello");
        list.add("World");

        for(Object obj : list) {
            System.out.println(obj);
        }
    }
}
