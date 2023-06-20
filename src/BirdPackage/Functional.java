package BirdPackage;
@FunctionalInterface
interface Functional {

    int getValue();

    default int getFood(){
        System.out.println("hello good food");
        return 0;
    }



}
