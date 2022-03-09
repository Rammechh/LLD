package DesignPatterns.CreationalDesignPattern.FactoryDP.FactoryMethodPattern;

public class DomesticPlan extends ElectricBillPlan {
    @Override
    public void  getRate(){
        rate = 3.50;
    }
}
