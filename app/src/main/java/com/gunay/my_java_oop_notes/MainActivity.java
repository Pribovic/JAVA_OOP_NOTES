package com.gunay.my_java_oop_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

        user myuser = new user();
        myuser.name = "Gunay";
        myuser.job  = "Software Developer";

        user usertwo = new user();
        usertwo.name = "Jhonaton";
        usertwo.job  = "Painter";

        */

        user myuser = new user("Gunay","Software Developer");
        user usertwo = new user("Jhonaton","Painter");

        System.out.println(myuser.name);


        //Encapsulation and password
        Musician james = new Musician("james","Guitar",50);
        System.out.println(james.getName());
        james.setAge(60,"wasd");
        System.out.println(james.getName());
        /*
        james.age = 60;
        System.out.println(james.enstrument);
        System.out.println(james.age);
        */

        //Inheritance - kalıtım
        SuperMusician lars = new SuperMusician("Lars","Drums",45);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism - bir metodun aynı isimle birden çok işlemde kullanılabilmesi

        //Static Polymorphism  - aynı sınıf içerisinde farklı metodları aynı isimle kullanma
        Mathematics mat = new Mathematics();
        System.out.println(mat.sum());
        System.out.println(mat.sum(3,5));
        System.out.println(mat.sum(3,5,7));

        //Dynamic Polymorphism farklı sınıf içerisinde farklı metodları aynı isimle kullanma
        Animal myAnimal = new Animal();
        myAnimal.voice();

        Cat tekir = new Cat();
        tekir.test();
        tekir.voice();

        //Abstract Class - diğer sınıflar extend etsin diye oluşturulur
        System.out.println(myuser.information());

        //Interface  - interface'ler extend edilmez implement edilir
        Piano myPiano = new Piano();
        myPiano.info();
        myPiano.brand = "asus";


    }










































}