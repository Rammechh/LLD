package DesignPatterns.StructuralDesignPattern.Adapter.Example2;

public class BankDetails {
    public String bankName;
    public String accHolderName;
    public long accNumber;

    public String getAccHolderName() {
        return accHolderName;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public String getBankName(){
        return bankName;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

}
