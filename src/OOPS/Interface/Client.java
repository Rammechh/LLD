package OOPS.Interface;

public class Client {
    /* An interface in Java is a blueprint of a class. It has static constants and abstract methods.

    The interface in Java is a mechanism to achieve abstraction
    There can be only abstract methods in the Java interface, not method body.
    It is used to achieve abstraction and multiple inheritance in Java

    1. It is used to achieve abstraction.
    2. By interface, we can support the functionality of multiple inheritance.
    3. It can be used to achieve loose coupling.
     */

    public static void main(String[] args){
        Printer printer = new Printer();
        printer.print();
        printer.show();
        Printable.getStaticMsg();
    }
}
