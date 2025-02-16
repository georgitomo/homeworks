package Homework3;

public class Car {
    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

    Car(int year, double price, boolean isSportCar, int fuelTankCapacity,
        double freeFuel, String engineFuelOperationSystem) {
        this.year = year;
        this.price = price;
        this.isSportCar = isSportCar;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }

    void changeEngineFuelOperationSystem(String newEngineOperatingSystem) {
        this.engineFuelOperationSystem = newEngineOperatingSystem;
    }

    void useFuel(double fuel) {
        if (fuel > freeFuel) {
            System.out.println("Not enough free fuel!");
        } else {
            freeFuel -= fuel;
        }
    }
}
