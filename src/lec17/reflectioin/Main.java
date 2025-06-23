package lec17.reflectioin;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ReflectionDemo {
    public String noSecret = "안비밀입니다.";
    private String secret = "비밂입니다.";
    public ReflectionDemo() {
        System.out.println("ReflectionDemo 생성자 실행");
    }

    public String greet(String name) {
        return "Hello, " + name;
    }

    private String reveal(String code) {
        return "Access granted to: " + code;
    }
}

public class Main {
    public static void main(String[] args) {
        ReflectionDemo reflectionDemo = new ReflectionDemo();

//        reflectionDemo.secret // 접근 안됨 (private 때문에)

        Class<?> clazz = ReflectionDemo.class;
        System.out.println("클래스 이름: " + clazz.getName());

        System.out.println("\n[필드 목록]");
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            System.out.println("필드: " + field.getName());
        }

        System.out.println("\n[메서드 목록]");
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods) {
            System.out.print("메서드: " + method.getName());
            for(Class<?> paramType : method.getParameterTypes()) {
                System.out.println(" 파라미터 타입: " + paramType.getSimpleName());
            }
        }

        try{
            Object instance = clazz.getDeclaredConstructor().newInstance();

            Method greetMethod = clazz.getMethod("greet", String.class);
            Object greetResult = greetMethod.invoke(instance, "sy");
            System.out.println("\n[퍼블릭 메서드 실행 결과]");
            System.out.println("greet(): " + greetResult);

            Method revealMethod = clazz.getDeclaredMethod("reveal", String.class);
            revealMethod.setAccessible(true);
            Object revealResult = revealMethod.invoke(instance, "hello");
            System.out.println("\n[프라이빗 메서드 실행 결과]");
            System.out.println("reveal(): " + revealResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
