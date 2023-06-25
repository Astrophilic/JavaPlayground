package designpatterns.factorypattern;

public  class NormalVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle createCar() {
        return new NormalCar();
    }
    @Override
    public Vehicle createTruck() {
        return new NormalTruck();
    }
}
