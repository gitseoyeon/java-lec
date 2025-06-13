package lec11.polymorphism;

public class Rectangle extends Shape{
    double w;
    double h;
    public Rectangle(int w, int h){
        this.h = h;
        this.w = w;
    }

    @Override
    double area() {
        return h * w;
    }
}
