package edu.ldsbc.abstractexample;

public abstract class Student extends Person {

    Float gpa;

    public Student(String name, int age, float height) {
        super(name, age, height);
    }

//    @Override
//    public String printPerson() {
//        return null;
//
//
//    }


    public String printfffPerson() {
        this.printPerson();
        return "name=" + this.getName();
    }
}
