package DesignPatterns.StructuralDesignPattern.Decorator;

public class Client {
    //https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
    //This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
//    1. It provides greater flexibility than static inheritance.
//    2. It enhances the extensibility of the object, because changes are made by coding new classes.
//    3. It simplifies the coding by allowing you to develop a series of functionality from targeted classes
//       instead of coding all of the behavior into the object.

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
