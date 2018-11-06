package com.company;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Task_Lab_8 {
   ArrayList<Auto> AutoBase = new ArrayList<Auto>();


   public Task_Lab_8(Auto auto){//конструктор
       this.AutoBase.add(auto);
   }

   public Task_Lab_8(ArrayList<Auto> a){
       this.AutoBase=a;
   }
   public Task_Lab_8(){}

    public void addAuto(Auto auto){
        this.AutoBase.add(auto);
    }

    public void ToFile(){
        Task_Lab_9 lab9 = new Task_Lab_9();
        lab9.ToBinFileAll(this.AutoBase);
    }
    public void FromFile(){
        Task_Lab_9 lab9 = new Task_Lab_9();
        this.AutoBase=lab9.FromBinFileAll();

    }
    public void prinrAutoAll(){
    for (int i = 0; i <this.AutoBase.size() ; i++) {
        printAutoData(this.AutoBase.get(i));
    }
}

   public void deleteAuto(String deleteNumber){
       //аходим по номеру
       // запоминаем индекс и сносим к чертям
       for (int i = 0; i < this.AutoBase.size(); i++) {
           if(this.AutoBase.get(i).getRegistrationNumberOfTheCar()
                   .contains(deleteNumber)){
               this.AutoBase.remove(this.AutoBase.indexOf(this.AutoBase.get(i)));
               System.out.println("Auto detected and delete!");

           }
       }
       System.out.println("Auto not detected!");
   }

   public void printAutoData(Auto auto){
       System.out.println("------------------------------------------");
       System.out.println("Registration Number Of The Car:"+auto.getRegistrationNumberOfTheCar());
       System.out.println("Brand:"+auto.getBrand());
       System.out.println("Year Of Relese:"+auto.getYearOfRelease());
       System.out.println("Color:"+auto.getColor());
       System.out.println("Name Of The Owner:"+auto.getNameOfTheOwner());
       System.out.println("Residence Address Of The Owner:"+auto.getResidenceAddressOfTheOwner());
       System.out.println("Car Type:"+auto.getCarType());
       System.out.println("------------------------------------------");


   }

   public boolean SearchAuto(String partOfregistrationNumberOfTheCar) {
       System.out.println("The required part:" + partOfregistrationNumberOfTheCar);

       for (int i = 0; i < this.AutoBase.size(); i++) {
           if(this.AutoBase.get(i).getRegistrationNumberOfTheCar()
                   .contains(partOfregistrationNumberOfTheCar)){
               System.out.println("status:detected");
               printAutoData(this.AutoBase.get(i));
               return true;
           }
       }
       System.out.println("status:not detected");
       return false;
   }

    public boolean SearchAoto(String desiredBrand , String desiredColor){
        System.out.println("The desired Brand:" + desiredBrand+"\nThe desired Color:"+desiredColor);

        for (int i = 0; i <this.AutoBase.size() ; i++) {
            if(this.AutoBase.get(i).brand.toString().equals(desiredBrand)){
                if(this.AutoBase.get(i).color.toString().equals(desiredColor)){
                    System.out.println("status:detected");
                    printAutoData(this.AutoBase.get(i));
                    return true;
                }
            }
        }
        System.out.println("status:not detected");
       return false;
    }

    public void addToTop(Auto auto){
       this.AutoBase.add(0,auto);
    }
}
