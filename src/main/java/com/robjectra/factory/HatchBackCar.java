package com.robjectra.factory;

public class HatchBackCar implements Car{
    @Override
    public boolean assembly(){
        System.out.println("HatchBack Car");
        return false;
    }
}
