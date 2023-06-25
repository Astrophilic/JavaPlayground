package designpatterns.factorypattern;

public class VehicleClientContext {

    public static void runFactoryExample(){
        VehicleFactory normalFactory = new NormalVehicleFactory();

        Vehicle normalCar = normalFactory.createCar();

        Vehicle normalTruck = normalFactory.createTruck();

        Vehicle luxuryCar = new LuxuryVehicleFactory().createCar();
        Vehicle luxuryTruck = new LuxuryVehicleFactory().createTruck();
    }
}
