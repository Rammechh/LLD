package SOLID_Principles.SRP;

public class Client {
    public static void main(String[] args) {
        Singleton dbc = Singleton.getInstance();
        Singleton dbc1 = Singleton.getInstance();
        System.out.println(dbc);
        System.out.println(dbc1);
    }
}
