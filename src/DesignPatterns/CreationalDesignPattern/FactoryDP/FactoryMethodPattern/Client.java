package DesignPatterns.CreationalDesignPattern.FactoryDP.FactoryMethodPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//https://www.javatpoint.com/factory-method-design-pattern
public class Client {
    /*A Factory Pattern or Factory Method Pattern says that just define an interface or
    abstract class for creating an object but let the subclasses decide which class to instantiate.
    In other words, subclasses are responsible to create the instance of the class.

    The Factory Method Pattern is also known as Virtual Constructor.

    Used When a class doesn't know what subclasses will be required to create
    Step 1: Create a Plan abstract class.
    Step 2: Create the concrete classes that extends Plan abstract class.
    Step 3: Create a GetPlanFactory to generate object of concrete classes based on given information.
    Step 4: Generate Bill by using the GetPlanFactory to get the object of concrete classes by passing
    an information such as type of plan DomesticPLAN or CommercialPLAN or InstitutionalLPLAN.
    */
    public static void main(String[] args) {

        while (1==1) {
            GetPlanFactory planFactory = new GetPlanFactory();
            System.out.println("Choose the plan from 1-3 for which bill to be generated");
            GetAllPlans getAllPlans = new GetAllPlans();
            getAllPlans.allPlans();

//          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//          String planName = Integer.parseInt(br.readLine());

            Scanner sc = new Scanner(System.in);
            int planNo = sc.nextInt();
            if (planNo == 4) {
                break;
            }
            String planName = GetAllPlans.getPlanName(planNo);

            System.out.println("Enter the number of units for which bill will be calculated");
            int units = sc.nextInt();

            ElectricBillPlan p = GetPlanFactory.getPlan(planNo);

            System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
            p.getRate();
            p.calculateBill(units);
        }
    }

}
