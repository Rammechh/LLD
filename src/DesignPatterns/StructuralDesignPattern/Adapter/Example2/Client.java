package DesignPatterns.StructuralDesignPattern.Adapter.Example2;

public class Client {
    //    An Adapter Pattern says that just "converts the interface of a class into another interface
//    that a client wants". The Adapter Pattern is also known as Wrapper.
//    https://www.javatpoint.com/adapter-pattern

//    1. Create a CreditCard interface (Target interface).
//    2. Create a BankDetails class (Adaptee class).
//    3. Create a BankCustomer class (Adapter class).
//Create a AdapterPatternDemo class (client class).

    public static void main(String[] args) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.println(targetInterface.getCreditCard());
    }
}
