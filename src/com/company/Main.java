package com.company;

public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto();
        System.out.println("RegistrationNumberOfTheCar test");
        System.out.println(auto.getRegistrationNumberOfTheCar());
        String number="AA1234BC";
        auto.setRegistrationNumberOfTheCar(number);
        System.out.println(auto.getRegistrationNumberOfTheCar());

        System.out.println("Brand test");
        System.out.println(auto.getBrand());
        auto.setBrand("Merzedes");
        String brand = "BMW";
        auto.setBrand(brand);
        System.out.println(auto.getBrand());

        System.out.println("YearOfRelease test");
        System.out.println(auto.getYearOfRelease());
        auto.setYearOfRelease(1999);
        System.out.println(auto.getYearOfRelease());


        System.out.println("color test");
        System.out.println(auto.getColor());
        auto.setColor("RED");
        System.out.println(auto.getColor());

        System.out.println("nameOfTheOwner test");
        System.out.println(auto.getNameOfTheOwner());
        auto.setNameOfTheOwner("Dudko Oleg Sergeevich");
        System.out.println(auto.getNameOfTheOwner());


        System.out.println("residenceAddressOfTheOwner test");
        System.out.println(auto.getResidenceAddressOfTheOwner());
        auto.setResidenceAddressOfTheOwner("Ukraine,Odessa,65000,Shevchenko,1,28");
        System.out.println(auto.getResidenceAddressOfTheOwner());


        System.out.println("carType test");
        System.out.println(auto.getCarType());
        auto.setCarType("Sedan");
        System.out.println(auto.getCarType());

    }
}
