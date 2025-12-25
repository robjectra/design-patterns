package com.robjectra.factory;

public class CarsFactory {
    public static Car getCar(String carType){
        Car carFactory = null;
        if (carType.equalsIgnoreCase("sedan")){
            carFactory = new SedanCar();
        }
        return carFactory;
    }
}
