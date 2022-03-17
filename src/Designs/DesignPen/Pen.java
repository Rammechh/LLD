package Designs.DesignPen;

public abstract class Pen implements Writable{

    @Override
    public void write(){
        System.out.println("Pen method");
    }
}
