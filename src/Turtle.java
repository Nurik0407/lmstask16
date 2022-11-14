public class Turtle extends Animal {

    public void swim() {
        System.out.println(getName() + " swims at a speed of 35 km/h");
    }

    public Turtle(String name) {

        super(name);
    }

    @Override
    public void getFood(String info) {
        System.out.println(getName() + " eating " + info);
    }
}
