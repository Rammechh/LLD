package DesignPatterns.CreationalDesignPattern.FactoryDP.AbstractFactoryPattern;

public class EducationalLoan extends Loan{
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
