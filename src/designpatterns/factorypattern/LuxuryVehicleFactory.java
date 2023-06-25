package designpatterns.factorypattern;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createCar() {
        return new LuxuryCar();
    }

    @Override
    public Vehicle createTruck() {
        return new LuxuryTruck();
    }
}
