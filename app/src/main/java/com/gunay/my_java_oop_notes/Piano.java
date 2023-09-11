package com.gunay.my_java_oop_notes;

import java.sql.SQLOutput;

public class Piano implements Instrument, HouseDecor{

    String brand;
    boolean digital;

    @Override  // metodun üstüne yazmaya override denir
    public void info() {
        System.out.println("override methods");
    }
}
