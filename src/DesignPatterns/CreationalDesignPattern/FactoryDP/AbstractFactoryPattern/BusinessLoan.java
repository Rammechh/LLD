package DesignPatterns.CreationalDesignPattern.FactoryDP.AbstractFactoryPattern;

public class BusinessLoan extends Loan{
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
