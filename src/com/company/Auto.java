package com.company;
import java.io.Serializable;
import java.util.Date;
import java.util.regex.*;



public class Auto implements Serializable {
    String registrationNumberOfTheCar;
    String brand;
    int yearOfRelease;
    String color;
    String nameOfTheOwner;
    String residenceAddressOfTheOwner;
    String carType;

    public Auto(String registrationNumberOfTheCar,String brand,int yearOfRelease,
            String color,String nameOfTheOwner,String residenceAddressOfTheOwner,
            String carType)
    {
      this.setRegistrationNumberOfTheCar(registrationNumberOfTheCar);
      this.setBrand(brand);
      this.setYearOfRelease(yearOfRelease);
      this.setColor(color);
      this.setNameOfTheOwner(nameOfTheOwner);
      this.setResidenceAddressOfTheOwner(residenceAddressOfTheOwner);
      this.setCarType(carType);

    }
    public Auto(){}

    void setRegistrationNumberOfTheCar(String newRegistrationNumberOfTheCar){
        Pattern registrationNumberOfTheCarFormat = Pattern.compile("\\D{2}\\d{4}\\D{2}");
        // шаблом регулярного выражения для номера(первые два символа-любые буквы, следующие четыре-любые цифры, потом опять две буквы)
        Matcher m = registrationNumberOfTheCarFormat.matcher(newRegistrationNumberOfTheCar);
        //обьект искатель.интерпретирует шаблон и выполняет операции сопоставления с входной строкой
        //мы отправили в обьект искатель то, что хотим записать в качестве нового номера
        if(m.matches())//вернёт тру, если наш новый номер соответствует регулярному выражению
        {
            this.registrationNumberOfTheCar=newRegistrationNumberOfTheCar;//если тру, тогда записываем новый на место старого
        }
        else
            System.out.println("Номер введен некорректно!");
    }
    String getRegistrationNumberOfTheCar(){return this.registrationNumberOfTheCar;}
    void setBrand(String newBrand){
        if (Brand.isTrueBrand(newBrand)){
            this.brand=newBrand;
        }
        else
            System.out.println("Марка введена некорректно!");
    }
    String getBrand(){return this.brand;}
    void setYearOfRelease(int newYearOfRelease){
        //System.out.println("Year: "+new Date().getYear());
        if((newYearOfRelease>1900)&&(newYearOfRelease<=(1900+new Date().getYear())))//getYear возвращает год от 1900(одному господу известно, почему)
        {
            this.yearOfRelease=newYearOfRelease;
        }
        else
            System.out.println("Год выпуска введён некорректно!");
    }
    int getYearOfRelease(){return this.yearOfRelease;}
    void setColor(String newColor){
        if(Color.isTrueColor(newColor)){
            this.color=newColor;
        }
        else
            System.out.println("Цвет введён некорректно!");

    }
    String getColor(){
        return this.color;
    }
    void setNameOfTheOwner(String newNameOfTheOwner){
        Pattern NameOfTheOwnerFormat = Pattern.compile("^([A-Z][a-z]+) ([A-Z][a-z]+) ([A-Z][a-z]+)$");
        // шаблом регулярного выражения для ФИО
        Matcher m = NameOfTheOwnerFormat.matcher(newNameOfTheOwner);
        //обьект искатель.интерпретирует шаблон и выполняет операции сопоставления с входной строкой
        //мы отправили в обьект искатель то, что хотим записать в качестве нового ФИО
        if(m.matches())//вернёт тру, если наш новый ФИО соответствует регулярному выражению
        {
            this.nameOfTheOwner=newNameOfTheOwner;//если тру, тогда записываем новый на место старого
        }
        else
            System.out.println("ФИО введены некорректно!");
    }
    String getNameOfTheOwner(){return this.nameOfTheOwner;}
    void setResidenceAddressOfTheOwner(String newResidenceAddressOfTheOwner){
        Pattern ResidenceAddressOfTheOwnerFormat = Pattern.compile("([A-Z][a-z]+),([A-Z][a-z]+),([\\w]{5}),([A-Z][a-z]+),([\\w]*),([\\w]*)");
        // Страна,Город,Почтовый индекс,Улица,Дом,Квартира
        // шаблом регулярного выражения для адреса
        Matcher m = ResidenceAddressOfTheOwnerFormat.matcher(newResidenceAddressOfTheOwner);
        //обьект искатель.интерпретирует шаблон и выполняет операции сопоставления с входной строкой
        //мы отправили в обьект искатель то, что хотим записать в качестве нового адреса
        if(m.matches())//вернёт тру, если наш новый адрес соответствует регулярному выражению
        {
            this.residenceAddressOfTheOwner=newResidenceAddressOfTheOwner;//если тру, тогда записываем новый на место старого
        }
        else
            System.out.println("Адрес введен некорректно!");}
    String getResidenceAddressOfTheOwner(){return this.residenceAddressOfTheOwner;}
    void setCarType(String newCarType){
        if(CarType.isTrueCarType(newCarType)){
            this.carType=newCarType;
        }
        else
            System.out.println("Тип кузова введён некорректно!");
    }
    String getCarType(){return this.carType;}
}

enum CarType{
    Sedan,
    Hatchback,
    Universal,
    Liftback,
    Coupe,
    Convertible,
    Roadster,
    Stretch,
    Targa,
    SUV,
    Crossover,
    Pickup,
    Truck,
    Van,
    Minivan;

    public static boolean isTrueCarType(String carType){
        CarType[] array =CarType.values();
        for (int i = 0; i <array.length ; i++) {
            // System.out.println(array[i]);
            if(array[i].toString().equals(carType)){
                return true;
            }
        }
        return false;
    }

}

enum Color{
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
    private String code;
    Color(String code){
        this.code = code;
    }
    public String getCode(){ return code;}

    public static boolean isTrueColor(String color){
        Color[] array =Color.values();
        for (int i = 0; i <array.length ; i++) {
            // System.out.println(array[i]);
            if(array[i].toString().equals(color)){
                return true;
            }
        }
        return false;
    }
}

enum Brand{
    BMW,LADA,Lexus,Tesla,Citroen;

    public static boolean isTrueBrand(String brand){
        Brand[] array =Brand.values();
        for (int i = 0; i <array.length ; i++) {
           // System.out.println(array[i]);
            if(array[i].toString().equals(brand)){
                return true;
            }
        }
        return false;
    }
}