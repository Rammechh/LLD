package OOPS.Aggregarion;

public class Client {
    public static void main(String[] args){
        Address address1 = new Address("Chennai", "Tamil nadu", "India");

        Employee employee1 = new Employee(1, "Ram", address1);
        employee1.display();
    }
}
