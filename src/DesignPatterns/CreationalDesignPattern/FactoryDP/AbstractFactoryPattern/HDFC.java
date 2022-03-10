package DesignPatterns.CreationalDesignPattern.FactoryDP.AbstractFactoryPattern;

public class HDFC implements Bank{
    private final String BankName;

    public HDFC(){
        BankName = "HDFC Bank";
    }

    @Override
    public String getBankName() {
        return BankName;
    }
}
