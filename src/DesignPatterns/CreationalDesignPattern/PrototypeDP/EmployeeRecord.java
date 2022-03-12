package DesignPatterns.CreationalDesignPattern.PrototypeDP;

public class EmployeeRecord implements Prototype{

    private int id;
    private String name;
    private String designation;
    private double salary;
    private String address;

    public EmployeeRecord(int id, String name, String designation, double salary, String address){
        this.id =id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord(){
        System.out.println("Employee Records of xyz Corporation");
        System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");
        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t\t"+address);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, designation, salary, address);
    }
}
