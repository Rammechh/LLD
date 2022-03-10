package DesignPatterns.CreationalDesignPattern.FactoryDP.AbstractFactoryPattern;

public class GetList {
    public static void getBankList() {
        System.out.println("Available Banks");
        for (Banks b : Banks.values()) {
            System.out.println(b);

        }
    }

    public static void getLoanList() {
        System.out.println("Available Loans");
        for(Loans l : Loans.values()){
            System.out.println(l);
        }
    }
}
