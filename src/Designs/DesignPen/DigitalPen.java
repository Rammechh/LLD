package Designs.DesignPen;

public abstract class DigitalPen extends Pen{
    WriteBehaviour behaviour;
    DigitalPen(WriteBehaviour behaviour){
        this.behaviour = behaviour;
    }
}
