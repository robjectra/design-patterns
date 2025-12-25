package com.robjectra.factory;

public class SedanCar implements Car{
    @Override
    public boolean assembly(){
        System.out.println("SEDAN Car");
        return false;
    }
}
