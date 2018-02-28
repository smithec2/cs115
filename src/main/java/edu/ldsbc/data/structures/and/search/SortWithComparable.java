package edu.ldsbc.data.structures.and.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWithComparable {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Zane", 47, 5.11f));
        list.add(new Person("Ann", 21, 5.6f));
        list.add(new Person("Nako", 28, 5.2f));
        list.add(new Person("Steve", 18, 6f));
        list.add(new Person("Abe", 67, 6.2f));

        Collections.sort(list);

        for(Person p : list)
            System.out.println(p.toString());
    }

}
