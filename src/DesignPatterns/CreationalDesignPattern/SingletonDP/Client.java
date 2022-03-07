package DesignPatterns.CreationalDesignPattern.SingletonDP;

public class Client {
    public static void main(String[] args) {

        /*
        All implementations of the Singleton have these two steps in common:

    1. Make the default constructor private, to prevent other objects from using the new operator with
    the Singleton class.
    2. Create a static creation method that acts as a constructor.
    Under the hood, this method calls the private constructor to create an object and
    saves it in a static field. All following calls to this method return the cached object.

    If your code has access to the Singleton class, then it’s able to call the Singleton’s static method.
    So whenever that method is called, the same object is always returned.
         */

        Singleton dbc = Singleton.getInstance();
        Singleton dbc1 = Singleton.getInstance();
        System.out.println(dbc);
        System.out.println(dbc1);

        BillPughSingleton dbc3 = BillPughSingleton.getInstance();
        System.out.println(dbc3);

        FinalSingleton dbc4 = FinalSingleton.getInstance();
        System.out.println(dbc4);
    }
}
