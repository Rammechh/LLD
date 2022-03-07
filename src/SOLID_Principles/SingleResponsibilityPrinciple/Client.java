package SOLID_Principles.SingleResponsibilityPrinciple;

public class Client {
    //The single responsibility principle states that every Java class must perform a single functionality.
    // Implementation of multiple functionalities in a single class mashup the code and
    // if any modification is required may affect the whole class.
    // It is precise the code and the code can be easily maintained.

    public static void main(String[] args) {
        Student student = new Student();
        Percentage percentage = new Percentage();
        PrintStudentDetails printStudentDetails = new PrintStudentDetails();
    }
}
