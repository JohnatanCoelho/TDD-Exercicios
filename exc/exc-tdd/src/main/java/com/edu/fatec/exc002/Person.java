package com.edu.fatec.exc002;

import java.util.List;

public class Person {

    private int id;
    private String name;
    private int age;
    private List<Email> emails;

    public Person(int id, String name, int age, List<Email> emails){
        this.id = id;
        this.name = name;
        this.age = age;
        this.emails = emails;
    }

    public int getAge() {
        return age;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Email> getEmails() {
        return emails;
    }    
}
