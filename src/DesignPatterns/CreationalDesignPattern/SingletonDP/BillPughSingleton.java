package DesignPatterns.CreationalDesignPattern.SingletonDP;

public class BillPughSingleton {

    /*
    These days Bill Pugh approach of creating singleton object is the most appreciated among the developers.
    The initialization of singleton object via static inner class makes it lazier than lazy initialization
    approach.
    It is also called initialization of singleton instance on demand holder idiom.
     */

    //Private constructor
    private BillPughSingleton(){

    }
    // create static class
    private static class PughSingleton{
        public static final BillPughSingleton dbc = new BillPughSingleton();
    }
    //public method to access private class
    public static BillPughSingleton getInstance(){
        return PughSingleton.dbc;
    }
}
