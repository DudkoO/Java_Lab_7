package com.company;

import java.io.*;
import java.util.ArrayList;

public class Task_Lab_9 {

    public void ToBinFileAll(ArrayList AutoBase){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("AutoBase.dat")))
        {
            oos.writeObject(AutoBase);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        for (int i = 0; i <AutoBase.size(); i++) {

        }
    }
    public void ToBinFile(Auto auto) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("AutoBase.dat")))
        {
            oos.writeObject(auto);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
    public void FromBinFile(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("AutoBase.dat")))
        {
            Auto auto=(Auto) ois.readObject();
            System.out.printf("Name: %s \t Age: %s \n", auto.getRegistrationNumberOfTheCar(),auto.getBrand());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
    public ArrayList<Auto> FromBinFileAll(){
        ArrayList<Auto> AutoBase=null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("AutoBase.dat")))
        {
             AutoBase=(ArrayList) ois.readObject();
            //System.out.printf("Name: %s \t Age: %s \n", AutoBase.get(0);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return AutoBase;
    }

}


