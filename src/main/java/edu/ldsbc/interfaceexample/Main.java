package edu.ldsbc.interfaceexample;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Anamal dog = new Dog();
        Anamal cat = new Cat();
        Anamal pig = new Pig();

        System.out.println( pig.speaks());

        Collection<Anamal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);

    }
}
