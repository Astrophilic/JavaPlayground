package BirdPackage;

public class Parrot extends  Bird implements canFly{
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
