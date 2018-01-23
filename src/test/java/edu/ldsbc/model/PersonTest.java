package edu.ldsbc.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void temp() throws Exception {
        Person person = new Person();
        person.setName("Reed");
        person.setAge(39);

        assertEquals("Reed", person.getName());

        //change name on person to robert
        //person.setName("robert");
        assertEquals("robert", person.getName());

        Person person2 = new Person();
        person2.setName("Mikel");
        person2.setAge(25);

        assertEquals("Mikel", person2.getName());




    }
}