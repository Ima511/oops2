package oops2;

public class Dog extends Animal{

    private int wings;

    public Dog(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }
}
