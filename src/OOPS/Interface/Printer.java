package OOPS.Interface;

public class Printer implements Printable, Showable{

    public void print(){
        System.out.println("In print method - implemented Printable interface");
    }

    public void show(){
        System.out.println("In show method - implemented both Printable and Showable interface and achieved " +
                "Multiple inheritance");

    }
}
