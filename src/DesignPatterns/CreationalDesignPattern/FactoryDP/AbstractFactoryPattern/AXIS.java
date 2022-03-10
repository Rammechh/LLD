package DesignPatterns.CreationalDesignPattern.FactoryDP.AbstractFactoryPattern;

public class AXIS implements Bank{

    private final String BankName;

    public AXIS(){
        BankName = "AXIS Bank";
    }

    @Override
    public String getBankName() {
        return BankName;
    }
}
