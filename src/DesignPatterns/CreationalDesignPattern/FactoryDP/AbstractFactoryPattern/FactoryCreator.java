package DesignPatterns.CreationalDesignPattern.FactoryDP.AbstractFactoryPattern;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("Bank"))
            return new BankFactory();
        else if (choice.equalsIgnoreCase("loan"))
            return new LoanFactory();

        return null;
    }
}
