package lec11;

public class Access {
    public static String publicField = "나는 퍼블릭 하다.";
    private static String privateField = "나는 프라이빗하다.";
    static String defaultField = "나는 디폴트하다.";
    protected static String protectedField = "나는 프로텍트 하다.";
    public static void main(String[] args) {
        System.out.println(publicField); // 같은 클래스 접근 가능
        System.out.println(privateField); // 같은 클래스 접근 가능
        System.out.println(defaultField); // 같은 클래스 접근 가능
        System.out.println(protectedField); // 같은 클래스 접근 가능
    }
}

// 같은 패키지 내 다른 클래스 접근 제어
class Other {
    public Other(){
        System.out.println(Access.publicField);
        System.out.println(Access.defaultField);
        System.out.println(Access.protectedField);
//        System.out.println(Access.privateField); // 접근 불가
    }
}

class Child extends Access {
    public Child() {
        System.out.println(Access.publicField); // 자식 클래스 접근 가능
//        System.out.println(Access.privateField); // 자식 클래스 접근 불가능
        System.out.println(Access.defaultField); // 자식 클래스 접근 가능
        System.out.println(Access.protectedField); // 자식 클래스 접근 가능
    }
}