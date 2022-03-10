package DesignPatterns.CreationalDesignPattern.FactoryDP.AbstractFactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
//    Abstract Factory patterns work around a super-factory which creates other factories.
//    This factory is also called as factory of factories.
//    This type of design pattern comes under Creational pattern as this pattern provides one of the
//    best ways to create an object.

//    https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
//    https://www.javatpoint.com/abstract-factory-pattern#:~:text=Abstract%20Factory%20Pattern%20says%20that,returns%20a%20factory%20of%20classes.

//    Step 1: Create a Bank interface
//    Step 2: Create concrete classes that implement the Bank interface.
//    Step 3: Create the Loan abstract class.
//    Step 4: Create concrete classes that extend the Loan abstract class.
//    Step 5: Create an abstract class (i.e., AbstractFactory) to get the factories for Bank and Loan Objects.
//    Step 6: Create the factory classes that inherit AbstractFactory class to generate the object of concrete class based on given information.
//    Step 7: Create a FactoryCreator class to get the factories by passing an information such as Bank or Loan.
//    Step 8: Use the FactoryCreator to get AbstractFactory in order to get factories of concrete classes by passing an information such as type.

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of Bank from where you want to take loan amount: ");
        GetList.getBankList();
        String bankName=br.readLine();

        System.out.println("Enter the type of loan e.g. home loan or business loan or education loan : ");
        GetList.getLoanList();
        String loanName=br.readLine();

//        Abstract Factory
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b=bankFactory.getBank(bankName);

        System.out.println("Enter the interest rate for "+b.getBankName()+ ": ");

        double rate=Double.parseDouble(br.readLine());
        System.out.println("Enter the loan amount you want to take: ");

        double loanAmount=Double.parseDouble(br.readLine());
        System.out.println("Enter the number of years to pay your entire loan amount: ");
        int years=Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from "+ b.getBankName());

//        Abstract Factory
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");

        Loan l=loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount,years);
    }
}
