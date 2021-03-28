package blatt03;

public class AutoMain {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Red", 250);
        Auto auto2 = new Auto("Black", 350);
        Auto auto1_2 = new Auto("Red", 250);

        if (auto1.speed < auto2.speed){
            System.out.println("Auto2 ist schneller");
        }else {
            System.out.println("Auto1 ist schneller");
        }

        if (auto1.getColor().equals(auto2.getColor())){
            System.out.println("Beide Autos haben gleiche farbe");
        }else {
            System.out.println("Beide Autos haben unterschiedliche farbe");
        }

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto1_2);

        System.out.println();

        System.out.println(auto1 == auto2);     // == compares memory address
        System.out.println(auto1 == auto1_2);

        System.out.println();

        System.out.println(auto1.equals(auto2));        // .equals compares attribute values
        System.out.println(auto1.equals(auto1_2));

    }

}
