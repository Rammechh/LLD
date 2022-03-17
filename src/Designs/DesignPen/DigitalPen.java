package Designs.DesignPen;

public abstract class DigitalPen implements Writable{
    WriteBehaviour behaviour;
    DigitalPen(WriteBehaviour behaviour){
        this.behaviour = behaviour;
    }
}
