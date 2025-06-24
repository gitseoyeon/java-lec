package lec18.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface CustomInfo {
    String auther();
    String date();
    int version() default 1;
}

@CustomInfo(auther = "sy", date = "2025-06-24", version = 2)
class Demo {
    @CustomInfo(auther = "sysy", date = "2026-06-24")
    public void display() {
        System.out.println("Display method executed.");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Class<?> demoClass = demo.getClass();

        // 클래스에 대한 내용
        if(demoClass.isAnnotationPresent(CustomInfo.class)){
            CustomInfo classInfo = demoClass.getAnnotation(CustomInfo.class);
            System.out.println("Author: " + classInfo.auther());
            System.out.println("Date: " + classInfo.date());
            System.out.println("Version: " + classInfo.version());
        }

        // 메소드에 대한 내용
        try {
            Method m = demoClass.getMethod("display");

            if(m.isAnnotationPresent(CustomInfo.class)) {
                CustomInfo mi = m.getAnnotation(CustomInfo.class);

                System.out.println("Author: " + mi.auther());
                System.out.println("Date: " + mi.date());
                System.out.println("Version: " + mi.version());
            }
        } catch (NoSuchMethodException e) {
            e.getStackTrace();
        }
    }
}
