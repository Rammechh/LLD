package OOPS.Polymorphism.MethodOverRiding;

public class Client {
    /*
    If subclass (child class) has the same method as declared in the parent class,
    it is known as method overriding in Java.

    Uses:
    1. Method overriding is used to provide the specific implementation of a method which is
    already provided by its superclass.
    2. Method overriding is used for runtime polymorphism

    Rules:
    1. The method must have the same name as in the parent class
    2. The method must have the same parameter as in the parent class.
    3. There must be an IS-A relationship (inheritance).

    Q) Why can we not override static method?
    It is because the static method is bound with class whereas instance method is bound with an object.
    Static belongs to the class area, and an instance belongs to the heap area.
     */

    public static void main(String[] args){
        Bank bank = new Bank();
        Bank sbi = new SBI();
        Axis axis = new Axis();
        System.out.println("SBI- ROI: "+ sbi.getRateOfInterest());
        System.out.println("AXIS- ROI: "+ axis.getRateOfInterest());
    }
}
