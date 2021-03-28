package blatt03.Zoo;

public class Zoo {
    private double futterAmount;
    private double wasserAmount;
    private final int anzahlGehege;
    private final Tier[] tierArray;

    public Zoo(double futter, double wasserAmount, int anzahlGehege) {
        this.futterAmount = futter;
        this.wasserAmount = wasserAmount;
        this.anzahlGehege = anzahlGehege;
        this.tierArray = new Tier[anzahlGehege];
    }

    public void addNeuesTier(Tier tier){
        int freiGehege = findGehege();
        if (freiGehege >= 0){
           tierArray[freiGehege] = tier;
            System.out.println("Cage "+freiGehege + " : "+ tier.getName());
        }else {
            System.out.println("No space for "+ tier.getName());
        }
    }

    private int findGehege() {
        for (int i = 0; i < tierArray.length; i++) {
            if (this.tierArray[i] == null){
                return i;
            }
        }
        return -1;
    }

    public double getFutterAmount() {
        return futterAmount;
    }

    public double getWasserAmount() {
        return wasserAmount;
    }

    public boolean fuettern(Tier tier){
        if (this.futterAmount - tier.essen() >= 0){
            this.futterAmount -= tier.essen();
            return true;
        }else {
            return false;
        }
    }
    public boolean traenken(Tier tier){
        if (this.wasserAmount - tier.trinken() >= 0){
            this.wasserAmount -= tier.trinken();
            return true;
        }else {
            return false;
        }

    }

    public Tier[] getTierArray() {
        return tierArray;
    }
}
