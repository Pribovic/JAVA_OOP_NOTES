package com.gunay.my_java_oop_notes;

public class SuperMusician extends Musician{

    //Inheritance - kalıtım
    public SuperMusician(String name, String enstrument, int age) {
        super(name, enstrument, age);
    }

    public String sing(){
        return "sing";
    }

}
