package OOPS.Abstraction;

public class Client {

    /*Abstraction is a process of hiding the implementation details and showing only functionality to the user.

    Another way, it shows only essential things to the user and hides the internal details,
    for example, sending SMS where you type the text and send the message.
    You don't know the internal processing about the message delivery.*/

    public static void main(String[] args) {
        //Cannot create an object for abstract class
        //Shape shape = new Shape();
        Shape shape = new Circle();
        shape.draw();
        Shape rec = new Rectangle(5.5f, 10.5f);
        rec.area();
    }
}
