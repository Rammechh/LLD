package DesignPatterns.CreationalDesignPattern.FactoryDP.FactoryMethodPattern;

public abstract class ElectricBillPlan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
