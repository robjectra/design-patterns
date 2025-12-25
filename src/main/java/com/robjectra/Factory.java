package com.robjectra;

import com.robjectra.factory.Car;
import com.robjectra.factory.CarsFactory;
import static com.robjectra.factory.CarsFactory.getCar;

public class Factory {
    public static void run() {
        Car sedanCar = getCar("sedan");
        System.out.println(sedanCar.assembly());
    }
}
