package DesignPatterns.CreationalDesignPattern.SingletonDP;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class FinalSingleton implements Cloneable, Serializable {
    // private constructor
    private FinalSingleton(){

    }
    //BillPughSingleton
    private static class BillPugh {
        public static FinalSingleton dbc = new FinalSingleton();
    }
    public static FinalSingleton getInstance() {
        return BillPugh.dbc;
    }
    // Stop to Get New Object in Deserialization via readResolve()
    private Object readResolve() throws ObjectStreamException{
        return BillPugh.dbc;
    }
    //stopClone
    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}
