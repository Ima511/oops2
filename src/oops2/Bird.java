package oops2;

public class Bird extends Animal  {
    private int wing;

    public int getWing() {
        return wing;
    }





    public void setWing(int wing) {
        this.wing = wing;
    }

    public Bird(String name, String color, int legs, boolean hasTale, int wing) {
        super(name, color, legs, hasTale);
        this.wing = wing;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Eating Finished");
    }
    public void fly(){
        System.out.println(this.getName() + "is Flying");
    }

    public void fly(int speed){

    }

    public void fly(String name){

    }

}

