package DesignPatterns.CreationalDesignPattern.BuilderDP.Case1;

import java.security.InvalidParameterException;
import java.util.Map;

//3rd Approach (Lot of Duplication)
//public class Helper{
//    String name;
//    int age;
//    String phone;
//    String batch;
//    String email;
//    String password;
//}

public class Student {
    private String name;
    private int age;
    private String phone;
    private String batch;
    private String email;
    private String password;

    //1st approach Bad - use constructor
//    public Student(String name, int age, String phone, String batch, String email, String password) {
//        this.name = name;
//        this.age = age;
//        this.phone = phone;
//        this.batch = batch;
//        this.email = email;
//        this.password = password;
//    }
    // Bad for Readability

    //2nd Approach - use map to avoid confusions
    //Enum created to map paramValues - typo Errors avoided in client
//    public Student(Map<ParamValues, Object> parameters){
//        this.name = (String)parameters.get(ParamValues.name);
//        this.age = (int) parameters.get(ParamValues.age);
//    }

    //3rd Approach (Lot of Duplication)
    // Class is a Map that allows to store values of different types
//    public Student (Helper helper){
//
//         //Can do validation
//        if (helper.age < 18){
//            throw new InvalidParameterException();
//        }
//
//        this.name =helper.name;
//        this.age = helper.age;
//    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    //4th Approach (final Approach)
    public static class StudentBuilder{
        private Student student = new Student();

        public StudentBuilder setName(String name){
            student.name = name;
            return this;
        }
        public StudentBuilder setAge(int age){
            student.age = age;
            return this;
        }
        public StudentBuilder setPhone(String phone){
            student.phone = phone;
            return this;
        }
        public StudentBuilder setBatch(String batch){
            student.batch= batch;
            return this;
        }
        public StudentBuilder setEmail(String email){
            student.email = email;
            return this;
        }
        public StudentBuilder setPassword(String password){
            student.password = password;
            return this;
        }

        public Student clone(Student student){
            Student student1 = new Student();
            student1.name = student.name;

            return student1;
        }

        Student build(){
            if (student.age < 18){
                throw new InvalidParameterException();
            }
            if (student.name == null){
                throw new NullPointerException();
            }

            // Nullify coz there is possibility build method can be called Separately
            // multiple times in client
            // so always return new student obj
//            Student student1 = student;
//            return student1;
//            (or)
            return clone(student);
        }

    }


}

