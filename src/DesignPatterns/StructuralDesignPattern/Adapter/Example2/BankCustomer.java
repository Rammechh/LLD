package DesignPatterns.StructuralDesignPattern.Adapter.Example2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BankCustomer extends BankDetails implements CreditCard {
    @Override
    public void giveBankDetails() {
        try{
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the account holder name");
//            String customerName = sc.nextLine();
//
//            System.out.println("Enter the account number:");
//            long accNo =sc.nextLong();
//
//            System.out.println("Enter the bank name :");
//            String bankName= sc.nextLine();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customerName=br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            long accNo=Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankName=br.readLine();
            setAccHolderName(customerName);
            setBankName(bankName);
            setAccNumber(accNo);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accNo = getAccNumber();
        String accHolderName = getAccHolderName();
        String bName = getBankName();

        return ("The Account number "+accNo+" of "+accHolderName+" in " +bName
                + "bank is valid and authenticated for issuing the credit card.");
    }
}
