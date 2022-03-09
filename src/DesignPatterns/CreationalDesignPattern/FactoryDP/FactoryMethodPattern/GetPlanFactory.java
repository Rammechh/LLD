package DesignPatterns.CreationalDesignPattern.FactoryDP.FactoryMethodPattern;

import java.security.InvalidParameterException;

public class GetPlanFactory {
    public static ElectricBillPlan getPlan(int planType){

        if (planType == 1){
            return new DomesticPlan();
        }
        else if (planType == 2){
            return new CommercialPlan();
        }
        else if (planType == 3){
            return new InstitutionalPlan();
        }
        else
            throw new InvalidParameterException();

    }
}
