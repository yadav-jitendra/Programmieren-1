package blatt03_2;

public class Elephant extends Animal {

    public Elephant(String name, double hunger, double thirst, double size) {
        super(name, hunger, thirst, size);
    }

    @Override
    public String toString() {
        return this.getSize() >= 2 ? "Toeroeoe" : super.toString();
    }
}
