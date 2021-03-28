package blatt03.Zoo;

public class Elefant extends Tier{
    public Elefant(String name, double hunger, double durst, double groesse) {
        super(name, hunger, durst, groesse);
    }

    @Override
    public String toString() {
        if(this.groesse >= 2){
            return (super.toString() + "Töröö");
        }
        return super.toString();
    }
}
