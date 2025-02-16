package Homework3;

public class CarPerson {
    public static void main(String[] args) {
        Car lada = new Car(2000, 5000.00, false,
                80, 40, "Petrol");
        Car moskvich = new Car(2010, 5800.00, true,
                50, 25, "Gas");

        lada.useFuel(35.00);
        moskvich.changeEngineFuelOperationSystem("Diesel");

        System.out.println(lada.year + " " + lada.price + " " + lada.isSportCar + " " +
                        lada.fuelTankCapacity + " " + lada.freeFuel + " " +
                        lada.engineFuelOperationSystem);

        System.out.println(moskvich.year + " " + moskvich.price + " " + moskvich.isSportCar
                        + " " + moskvich.fuelTankCapacity + " " + moskvich.freeFuel
                        + " " + moskvich.engineFuelOperationSystem);
    }
}
