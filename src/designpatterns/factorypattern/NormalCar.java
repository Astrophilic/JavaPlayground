package designpatterns.factorypattern;

public class NormalCar extends  Car {
    public NormalCar() {
        System.out.println(" normal car");
        assemble();
    }

    @Override
    public void assemble() {
        System.out.println("Assembling normal car");
    }
}
