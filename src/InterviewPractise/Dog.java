package InterviewPractise;

import java.util.Objects;

public class Dog extends  Animal{

    private final String dogCategory;

    public Dog(String dogCategory) {
        this.dogCategory = dogCategory;
    }

    public Dog() {
        super();
        super.setName("Doggo");
        dogCategory = null;
    }

    @Override
    public void makeNoise() {
        System.out.println("bow b");
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogCategory);
    }



    @Override
    public String toString() {
        return "practise.Dog{" +
                "dogCategory='" + dogCategory + '\'' +
                '}';
    }
}
