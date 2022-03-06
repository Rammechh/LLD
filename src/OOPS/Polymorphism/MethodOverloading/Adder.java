package OOPS.Polymorphism.MethodOverloading;

public class Adder {
    int add(int a, int b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}
