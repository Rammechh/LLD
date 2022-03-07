package DesignPatterns.CreationalDesignPattern.SingletonDP;


public class StopCloneSingleton implements Cloneable{
    //private constructor
    private StopCloneSingleton(){

    }
    //BillPugh
    private static class BillPugh{
        public static final StopCloneSingleton dbc = new StopCloneSingleton();
    }
    public static StopCloneSingleton getInstance(){
        return BillPugh.dbc;
    }
    // Stop clone
    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}
