package Task6;

import java.util.Random;

import static Task6.Animals.*;

public class EnumTask {
    public static void run() {
        Random rand = new Random();
        Animals[] allAnimals = Animals.values(); // все животные из enum Animals
        Animals animal = allAnimals[Math.abs(rand.nextInt() % allAnimals.length)];  // случайное животное из списка
        long startTime = System.nanoTime();
        if (animal == Dog) {
            System.out.println(animal);
        } else if (animal == Cat) {
            System.out.println(animal);
        } else if (animal == Bear) {
            System.out.println(animal);
        } else if (animal == Horse) {
            System.out.println(animal);
        } else if (animal == Pig) {
            System.out.println(animal);
        } else if (animal == Cow) {
            System.out.println(animal);
        } else if (animal == Raccoon) {
            System.out.println(animal);
        } else if (animal == Tiger) {
            System.out.println(animal);
        } else if (animal == Lion) {
            System.out.println(animal);
        } else if (animal == Jaguar) {
            System.out.println(animal);
        } else if (animal == Ferret) {
            System.out.println(animal);
        } else if (animal == Wolf) {
            System.out.println(animal);
        } else if (animal == Elk) {
            System.out.println(animal);
        } else if (animal == Fox) {
            System.out.println(animal);
        } else if (animal == Rabbit) {
            System.out.println(animal);
        }
        long estimatedTime = System.nanoTime();
        System.out.println("else..if elapsed time: " + (estimatedTime - startTime));
        startTime = System.nanoTime();
        switch (animal) {
            case Dog:
                System.out.println(animal);
                break;
            case Cat:
                System.out.println(animal);
                break;
            case Bear:
                System.out.println(animal);
                break;
            case Horse:
                System.out.println(animal);
                break;
            case Pig:
                System.out.println(animal);
                break;
            case Cow:
                System.out.println(animal);
                break;
            case Raccoon:
                System.out.println(animal);
                break;
            case Tiger:
                System.out.println(animal);
                break;
            case Lion:
                System.out.println(animal);
                break;
            case Jaguar:
                System.out.println(animal);
                break;
            case Ferret:
                System.out.println(animal);
                break;
            case Wolf:
                System.out.println(animal);
                break;
            case Elk:
                System.out.println(animal);
                break;
            case Fox:
                System.out.println(animal);
                break;
            case Rabbit:
                System.out.println(animal);
                break;
            default:
                System.out.println("No animal");
        }
        estimatedTime = System.nanoTime();
        System.out.println("switch..case elapsed time: " + (estimatedTime - startTime));
    }
}
