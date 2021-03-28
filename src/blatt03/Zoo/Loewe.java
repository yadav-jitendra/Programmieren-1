package blatt03.Zoo;

import java.util.Random;

public class Loewe extends Tier{

    public Loewe(String name, double hunger, double durst, double groesse) {
        super(name, hunger, durst, groesse);
    }

    @Override
    public String toString() {
        return berechneRuf();
    }

    private String berechneRuf(){
        String[] sounds = {"Groooooooaaaaaaaar", "......."};
        Random random = new Random();
        return sounds[random.nextInt(2)];
    }

}
