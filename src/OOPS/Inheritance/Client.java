package OOPS.Inheritance;

public class Client {
    /*
    Inheritance in Java is a mechanism in which one object acquires all the properties and
    behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).

    When you inherit from an existing class, you can reuse methods and fields of the parent class.
    Moreover, you can add new methods and fields in your current class also.
    Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
     */

    public static void main(String[] args){

        Animal animal = new Animal();
        animal.eat();
        Animal dog = new Dog();
        dog.eat();
        Animal cat = new Cat();
        cat.eat();
    }
}
