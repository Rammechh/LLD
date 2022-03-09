package DesignPatterns.CreationalDesignPattern.FactoryDP.FactoryMethodPattern;

public class CommercialPlan extends ElectricBillPlan {
    @Override
    public void getRate() {
        rate = 7.50;
    }
}
