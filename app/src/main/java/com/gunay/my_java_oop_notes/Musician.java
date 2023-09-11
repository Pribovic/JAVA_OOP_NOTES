package com.gunay.my_java_oop_notes;

public class Musician {

    private String name;
    private String enstrument;
    private int age;

    public Musician(String name, String enstrument, int age) {
        this.name = name;
        this.enstrument = enstrument;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnstrument() {
        return enstrument;
    }

    public void setEnstrument(String enstrument) {
        this.enstrument = enstrument;
    }

    public int getAge() {
        return age;
    }

    //Password
    public void setAge(int age, String password) {
        if (password == "wasd"){
            this.age = age;
        }
    }
}
