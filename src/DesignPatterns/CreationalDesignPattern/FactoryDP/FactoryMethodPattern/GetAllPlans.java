package DesignPatterns.CreationalDesignPattern.FactoryDP.FactoryMethodPattern;

import java.security.InvalidParameterException;

public class GetAllPlans {
    public void allPlans(){
        int i = 1;
        for(Plans plan : Plans.values()){
            System.out.println(i+" "+plan);
            i++;
        }
    }
    public static String getPlanName(int no){
        if (no == 1)
            return "DomesticPlan";
        else if(no == 2)
            return "CommercialPlan";
        else if(no == 3)
            return "InstitutionalPlan";
        else
            throw new InvalidParameterException();
    }
}
