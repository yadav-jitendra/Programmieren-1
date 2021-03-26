package blatt02;

public class FizzBuzz {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        String array[] = new String[size];

        for (int i = 0; i < array.length ; i++) {
            array[i] = "" + (i+1);

            if ((i+1) % 15 == 0 ){
                array[i] = "fizzBuzz";

            }else if ((i+1) % 3 == 0 ){
                array[i] = "fizz";

            }else if ((i+1) % 5 == 0 ){
                array[i] = "buzz";
            }
        }

        for (String arr : array){
            System.out.println(arr);
        }
    }
}
