package blatt03_2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Simulation {


    public static void main(String[] args) {


        Zoo hagenbecksTierPark = new Zoo(2000d, 5000d, 5);

        Animal goat1 = new Animal("Goat", 3d, 2d);
        hagenbecksTierPark.newAnimal(goat1);

        Animal lion1 = new Lion("Lion", 4d, 3d, 2d);
        hagenbecksTierPark.newAnimal(lion1);

        Animal lion2 = new Lion("Lion", 5d, 6d, 3d);
        hagenbecksTierPark.newAnimal(lion2);

        Animal elephant1 = new Elephant("Elephant", 6d, 7d, 4d);
        hagenbecksTierPark.newAnimal(elephant1);

        Animal elephant2 = new Elephant("Elephant", 5d, 8d, 5d);
        hagenbecksTierPark.newAnimal(elephant2);

        Animal goat2 = new Animal("Goat2", 2d, 1d);
        hagenbecksTierPark.newAnimal(goat2);

        startSimulation(hagenbecksTierPark);
    }

    public static void startSimulation(Zoo zoo) {
        int i = 0;

        while (true) {
            String time = LocalDate.now().plusDays(i++).toString();

            System.out.println("\nDate and Time  " + time);
            System.out.printf("Food: %.2f Drink: %.2f %n", zoo.getFood(), zoo.getDrink());

            for (Animal animal : zoo.getAnimals()) {
                if (animal != null) {
                    if (zoo.provideFood(animal)) {
                        System.out.println(animal.getName() + " is getting Food ");

                    } else {
                        System.out.println("Not enough food for " + animal.getName() + "available");
                        return;
                    }

                    if (zoo.provideWater(animal)) {
                        System.out.println(animal.getName() + " is getting Food");
                    } else {
                        System.out.println("Not enough food for " + animal.getName() + " available");
                        return;
                    }
                }
            }
        }
    }

}
