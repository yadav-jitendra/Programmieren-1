package blatt03_2;

public class Zoo {

    private double food;
    private double drink;
    private final int cage;
    private Animal[] animals;

    public Zoo(double food, double drink, int cage) {
        this.food = food;
        this.drink = drink;
        this.cage = cage;
        this.animals = new Animal[cage];
    }

    public void newAnimal(Animal newAnimal) {
        boolean added = false;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = newAnimal;
                added = true;
                break;
            }
        }

        if (!added) {
            System.out.println(" Zoo is full, this " +  newAnimal.getName() + " cannot be added! ");
        }
    }

    public boolean provideFood(Animal animal) {
        boolean provided = false;
        if (this.food > 0) {
            this.food -= animal.eat();
            provided = true;
        }
        return provided;
    }

    public boolean provideWater(Animal animal) {
        boolean provided = false;
        if (this.drink > 0) {
            this.drink -= animal.drink();
            provided = true;
        }
        return provided;
    }

    public double getFood() {
        return food;
    }

    public double getDrink() {
        return drink;
    }

    public Animal[] getAnimals() {
        return animals;
    }

}
