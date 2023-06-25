package designpatterns.factorypattern;

public class LuxuryCar extends Car{
    public LuxuryCar() {
        System.out.println("Luxury car");
        assemble();
    }

    @Override
    public void assemble() {
        System.out.println("Assembling luxury car");
    }
}
