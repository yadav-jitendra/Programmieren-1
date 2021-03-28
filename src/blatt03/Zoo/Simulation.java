package blatt03.Zoo;

public class Simulation {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo(500,600,3);

        Loewe l1 = new Loewe("Lion1",20,10,3);
        myZoo.addNeuesTier(l1);

        Elefant e1 = new Elefant("Elefant1",50,20,5);
        myZoo.addNeuesTier(e1);

        Loewe l2 = new Loewe("Lion2",20,10,4);
        myZoo.addNeuesTier(l2);

        Elefant e2 = new Elefant("Elefant2",50,20,5);
        myZoo.addNeuesTier(e2);



    }
}
