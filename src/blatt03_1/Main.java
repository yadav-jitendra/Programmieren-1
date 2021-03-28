package blatt03_1;

public class Main {


    public static void main(String[] args) {
        Auto auto1 = new Auto("red",20);
        Auto auto2 = new Auto("red",20);
        Auto auto3 = auto1;

        // Speed comparison
        System.out.println();
        System.out.println("Auto1 has of speed: "+ auto1.getSpeed());
        System.out.println("Auto2 has of speed: "+ auto2.getSpeed());
        System.out.println();
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto1.equals(auto2));

    }
}
