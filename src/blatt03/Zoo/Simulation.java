package blatt03.Zoo;

public class Simulation {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo(5000,6000,3);

        Loewe l1 = new Loewe("Lion1",20,10,3);
        myZoo.addNeuesTier(l1);

        Elefant e1 = new Elefant("Elefant1",50,20,5);
        myZoo.addNeuesTier(e1);

        Loewe l2 = new Loewe("Lion2",20,10,4);
        myZoo.addNeuesTier(l2);

        Elefant e2 = new Elefant("Elefant2",50,20,5);
        myZoo.addNeuesTier(e2);

        startSimulation(myZoo);

    }

    private static void startSimulation(Zoo zoo) {
        int zeit = 0;
        System.out.println("\n*****Start Simulation*****");
        while (true){
            zeit++;
            System.out.println("\nDay : " + zeit);
            System.out.println("Zoo has - \n\tFood : " + zoo.getFutterAmount() + "\n\tDrink : "+ zoo.getWasserAmount());
        for (Tier tier : zoo.getTierArray()){
            if (zoo.fuettern(tier)){
                System.out.println(tier.getName() + " got Food");
            }else {
                System.out.println("No food for "+ tier.getName());
                return;
            }

            if (zoo.traenken(tier)){
                System.out.println(tier.getName() + " got Water");
            }else {
                System.out.println("No water for "+ tier.getName());
                return;
            }

        }

        }
    }
}
