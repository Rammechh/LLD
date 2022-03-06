package OOPS.Abstraction;

public class Rectangle extends Shape{
    float length;
    float breadth;

    Rectangle(float a, float b){
        this.length = a;
        this.breadth = b;
    }

    void draw(){
        System.out.println("Rectangle class");
    }
    public void area(){
        System.out.println("Area of Rectangle " + length*breadth);
    }
}
