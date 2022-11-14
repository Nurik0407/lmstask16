import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Shark("Nemo"), new Shark("Akula"),
                new Turtle("Leonardo"), new Turtle("Rafael"),
                new Eagle("Red"), new Eagle("Kush")};

        for (Animal animal : animals) {
            if (animal.getClass().equals(Shark.class)) {
                System.out.println(animal);
                ((Shark) animal).attack();
                animal.getFood("fish");
                System.out.println("\n~~~~~~~~~~~~~~~~~~");
            } else if (animal.getClass().equals(Turtle.class)) {
                System.out.println(animal);
                ((Turtle) animal).swim();
                animal.getFood("pizza");
                System.out.println("\n~~~~~~~~~~~~~~~~~~");
            } else if (animal.getClass().equals(Eagle.class)) {
                System.out.println(animal);
                ((Eagle) animal).fly();
                animal.getFood("rabbits");
                System.out.println("\n~~~~~~~~~~~~~~~~~~");
            }
        }
        Shark[] sharks = new Shark[2];
        Turtle[] turtles = new Turtle[2];
        Eagle[] eagles = new Eagle[2];


        for (int i = 0, j = 0, k = 0, g = 0; i < animals.length; i++) {
            if (animals[i] instanceof Shark) {
                sharks[j] = (Shark) animals[i];
                ((Shark) animals[i]).attack();
                j++;
                System.out.println("~~~~~~~~~~~~~~~~~~~~");
            }
            if (animals[i] instanceof Turtle) {
                turtles[k] = (Turtle) animals[i];
                ((Turtle) animals[i]).swim();
                k++;
                System.out.println("~~~~~~~~~~~~~~~~~~~~");

            } else if (animals[i] instanceof Eagle) {
                eagles[g] = (Eagle) animals[i];
                ((Eagle) animals[i]).fly();
                g++;
                System.out.println("~~~~~~~~~~~~~~~~~~~~");

            }
        }
        System.out.println(Arrays.toString(sharks)+"\n");
        System.out.println(Arrays.toString(turtles)+"\n");
        System.out.println(Arrays.toString(eagles)+"\n");
    }
}