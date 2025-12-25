package com.robjectra.factory;

public class SportsCar implements Car{
    @Override
    public boolean assembly() {
        System.out.println("Sport Car");
        return false;
    }
}
