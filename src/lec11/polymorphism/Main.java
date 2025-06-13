package lec11.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);

        for(Shape shape : shapes){
            System.out.printf("%.4f\n", shape.area());
        }
    }
}
