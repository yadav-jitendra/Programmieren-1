package blatt03.Zoo;

public abstract class Tier {
    protected String name;
    protected double hunger;
    protected double durst;
    protected double groesse;

    public Tier(String name, double hunger, double durst, double groesse) {
        this.name = name;
        this.hunger = hunger;
        this.durst = durst;
        this.groesse = groesse;
    }

    public Tier(String name, double hunger, double durst) {
       this(name,hunger,durst,1);
    }

    public double essen(){
        return this.hunger * this.groesse;
    }

    public double trinken(){
        return this.durst * this.groesse;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Trö";
    }
}
