package OOPS.Polymorphism.MethodOverloading;

public class Client {
    public static void main(String[] args){
        Adder adder = new Adder();
        int addTwoNo = adder.add(1, 2);
        int addThreeNo = adder.add(1, 2, 3);
        float addFloatType = adder.add(1.5f, 2.0f);

        System.out.println(addTwoNo);
        System.out.println(addThreeNo);
        System.out.println(addFloatType);
    }
}
