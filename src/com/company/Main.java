package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
/*
        Auto auto1=new Auto("AA1234BA","BMW",1999,"RED",
                "Dudko Oleg Sergeevich","Ukraine,Odessa,65000,Shevchenko,1,123",
                "Sedan");
        Auto auto2=new Auto("AA4444BA","BMW",2015,"RED",
                "Malakeev Vladislav Komenternovich","Ukraine,Odessa,65000,Shevchenko,1,25",
                "Minivan");
        ArrayList<Auto> AutoBase= new ArrayList<Auto>();

        AutoBase.add(auto1);
        AutoBase.add(auto2);


        Task_Lab_8 lab8=new Task_Lab_8(auto1);//создаем , используя конструктор

        lab8.addAuto(auto2); //добавляем запись
        */
        /*
        
        lab8.prinrAutoAll();//выводим всю базу
        lab8.SearchAuto("234");//ищем по части номера
        lab8.SearchAoto("BMW","RED");//ведём поиск на марке и цвету
        lab8.addToTop(auto2);//добавляем в начало
        System.out.println("________________________________");
        lab8.prinrAutoAll();
        System.out.println("__deleted__");
        lab8.deleteAuto("AA4444BA");
        */
        //lab8.prinrAutoAll();//выводим всю базу
        //lab8.ToFile();//записываем в файл базу
        Task_Lab_8 lab8=new Task_Lab_8();
        lab8.FromFile();//читаем из файла
        lab8.prinrAutoAll();//выводим всю базу




    }
}
