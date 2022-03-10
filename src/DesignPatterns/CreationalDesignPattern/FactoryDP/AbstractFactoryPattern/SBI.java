package DesignPatterns.CreationalDesignPattern.FactoryDP.AbstractFactoryPattern;

public class SBI implements Bank{

    private final String BankName;

    public SBI(){
        BankName = "SBI Bank";
    }

    @Override
    public String getBankName() {
        return BankName;
    }
}
