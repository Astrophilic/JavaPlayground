package designpatterns.factorypattern;

public class LuxuryTruck extends Truck{

    public LuxuryTruck() {
        System.out.println("luxury truck");
        assemble();
    }

    @Override
    public void assemble() {
        System.out.println("Assembling luxury truck");
    }
}
