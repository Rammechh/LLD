package DesignPatterns.CreationalDesignPattern.FactoryDP.FactoryMethodPattern;

public class InstitutionalPlan extends ElectricBillPlan {
    @Override
    public void getRate() {
        rate = 5.50;
    }
}
