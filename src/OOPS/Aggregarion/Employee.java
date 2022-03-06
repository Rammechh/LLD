package OOPS.Aggregarion;

public class Employee {
    int id;
    String name;
    Address address;

    Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id + " " + name);
        System.out.println("City-"+ address.city+"State-"+address.state+"Country-"+address.country);
    }
}
