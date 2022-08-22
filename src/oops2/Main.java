package oops2;

public class Main {

    public static void main(String[] args) {

        Bird hen = new Bird("jenny", "black", 3, true,5);
        System.out.println(hen.getName() + " " + hen.getColor() + " " + hen.getLegs()+ " " + hen.isHasTale());

        hen.eat("Corn");
//        System.out.println(hen.getWing());
//        hen.fly();
    }

}
