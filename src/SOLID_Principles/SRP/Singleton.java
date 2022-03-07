package SOLID_Principles.SRP;

public class Singleton {
    // https://www.concretepage.com/design-pattern/example-singleton-design-pattern-java
    // Eager Initialization
    // private static final Singleton dbc = new Singleton();
    private static Singleton dbc = null;
    private Singleton(){

    }
    // Lazy Initialization
    public static Singleton getInstance(){

        if(dbc == null){
            synchronized (Singleton.class){
                if(dbc ==null){
                    dbc = new Singleton();
                }
            }
        }
        return dbc;

    }
}
