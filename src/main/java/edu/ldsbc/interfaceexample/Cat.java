package edu.ldsbc.interfaceexample;

public class Cat implements Anamal {
    @Override
    public String speaks() {
        System.out.println(Anamal.CONT1);
        return "meow";
    }
}
