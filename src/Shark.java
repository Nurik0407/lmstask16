public class Shark extends Animal {
    public void attack() {
        System.out.println(getName() + " attacks 19km/h");
    }

    public Shark(String name) {
        super(name);
    }

    @Override
    public void getFood(String info) {
        System.out.println(getName() + " eating " + info);
    }
}
