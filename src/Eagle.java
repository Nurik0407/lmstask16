public class Eagle extends Animal {
    public void fly() {
        System.out.println(getName() +
                " is speeding 320km/h");
    }

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void getFood(String info) {
        System.out.println(getName()+" eating "+info);
    }
}
