package OOPS.Interface;

public interface Printable {
    public void print();

    public static void getStaticMsg(){
        //Since Java 8, we can have static method in interface
        System.out.println("This is static method in Interface");
    }
}
