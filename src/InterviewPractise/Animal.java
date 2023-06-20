package InterviewPractise;

import java.io.Serializable;

abstract class Animal implements Serializable , Cloneable{

    private String name;

    public static String getVariable() {
        return variable;
    }

    private static String variable="static parent variable";
    Animal() {
        System.out.println("This method is called by a child ");
        dance();
    }

    public  static  class AniChild{
        private String childName;

        public AniChild(String childName) {
            this.childName = childName;
        }

        public String getChildName() {
            return childName;
        }
        public  void printParentStaticVariable(){
            System.out.println(Animal.getVariable());
        }

        public void setChildName(String childName) {
            this.childName = childName;
        }
    }
    @Override
    protected Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }

    public String getName() {
        return name;
    }
    public static  void printMessage(){
        System.out.println("this is a static method inside an abstract class");
    }
    public void setName(String name) {
        this.name = name;
    }


    private Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();
    private void dance(){
        System.out.println("privae method within abstract class");
    }

    void sleep(){
        System.out.println("practise.Animal is sleeping");
    }
    void roam(){
        System.out.println("practise.Animal is roaming");
    }


    void eat(){
        System.out.println("practise.Animal is eating");
    }


}
