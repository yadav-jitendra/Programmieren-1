package blatt03;

public class ISBN {
    public static void main(String[] args) {

        // String s = args[0];
       // String s = "978-3-8274-1631-5";
        String s = "978-3-446-44073-2";

        int t = isbn(s);
        if (t == (int) (s.charAt(s.length() - 1)) - 48) {
            System.out.println(s + " ist eine gueltige ISBN.");
        } else {
            System.out.println(s + " ist eine fehlerhafte ISBN.");
            String r = "";
            for (int i = 0; i < s.length() - 1; i++) {
                r += s.charAt(i);
            }
            System.out.println("Gueltig waere " + r + t);
        }

    }
    public static int isbn(String t) {
        int x = 0;
        int n = 1;
        for (int i = 0; i < t.length() - 1; i++) {
            int ziffer = t.charAt(i) - '0';
            if ((ziffer >= 0) && (ziffer <= 9)) {
                if (n % 2 == 1) {
                    x += ziffer;
                } else {
                    x += 3 * ziffer;
                }
                n++;
            }
        }
        return (10 - x % 10) % 10;
    }

}
