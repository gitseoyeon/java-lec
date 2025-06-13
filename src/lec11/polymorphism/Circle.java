package lec11.polymorphism;

public class Circle extends Shape{
    double r;
    public Circle(int r){
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * (r * r);
    }
}
