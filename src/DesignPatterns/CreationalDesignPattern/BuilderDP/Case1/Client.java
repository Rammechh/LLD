package DesignPatterns.CreationalDesignPattern.BuilderDP.Case1;

import java.util.HashMap;
import java.util.Map;
// https://dzone.com/articles/design-patterns-the-builder-pattern

public class Client {
    public static void main(String[] args) {
//        Map<ParamValues, Object> mp = new HashMap<>();
//        mp.put(ParamValues.name, "Ram");
//        mp.put(ParamValues.age, 24);
//        Student student = new Student(mp);

        // 3rd Approach
//        Student.Helper helper = new Student.Helper();
//        helper.name = "Ram";
//        helper.age= 24;
//
//        Student student = new Student(helper);
        // 4th Approach

        Student s = Student.getBuilder()
                .setName("Ram")
                .setPhone("8045578954")
                .setBatch("Aug21")
                .build();

    }
}

// Journey
// we had a lot of parameters
// Instead of constructor we passed a map
// Issues: TypeCasting, Typos
// Solve Typos : Enums
// TypeCasting
// Separate Class
// Code Duplication
// Inner Class
