package javacore.oop.homework3;

import com.sun.jdi.connect.spi.TransportService;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("Aist", 2);
        bicycle.service();

        Car car = new Car("Mercedes Benz", 4);
        car.service();

        Truck truck = new Truck("Volvo Truck", 6);
        truck.service();

        Truck truck2 = new Truck("Kamaz Truck", 8);
        truck2.service();
    }
}
