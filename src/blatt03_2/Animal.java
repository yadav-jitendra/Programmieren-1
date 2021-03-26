package blatt03_2;

public class Animal {

    private String name;
    private double hunger;
    private double thirst;
    private double size;

    public Animal(String name, double hunger, double thirst) {
        this(name, hunger, thirst, 1);
    }

    public Animal(String name, double hunger, double thirst, double size) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.size = size;
    }

    public double drink() {
        return this.thirst * this.size;
    }

    public double eat() {
        return this.hunger * this.size;
    }

    public String getName() {
        return name;
    }

    public double getHunger() {
        return hunger;
    }

    public double getThirst() {
        return thirst;
    }

    public double getSize() {
        return size;
    }

    public String toString(){
        return "Troe";
    }

}
