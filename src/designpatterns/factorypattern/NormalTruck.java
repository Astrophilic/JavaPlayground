package designpatterns.factorypattern;

public class NormalTruck extends Truck{
    public NormalTruck() {
        System.out.println("normal truck");
        assemble();
    }

    @Override
    public void assemble() {
        System.out.println("Assembling normal truck");
    }
}
