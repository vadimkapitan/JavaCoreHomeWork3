package javacore.oop.homework3;

import com.sun.jdi.connect.spi.TransportService;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("Aist", 2);

        Car car = new Car("Mercedes Benz", 4);

        Truck truck = new Truck("Volvo Truck", 6);

        Truck truck2 = new Truck("Kamaz Truck", 8);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(truck);
    }
}
