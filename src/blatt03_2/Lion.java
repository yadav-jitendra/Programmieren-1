package blatt03_2;

import java.util.Random;

public class Lion extends Animal {

    public Lion(String name, double hunger, double thirst, double size) {
        super(name, hunger, thirst, size);
    }

    private String calculateLionSoundToday() {
        String[] sounds = {"Groooooooooooo", "......."};
        Random random = new Random();
        return sounds[random.nextInt(sounds.length)];
    }

    @Override
    public String toString() {
        return calculateLionSoundToday();
    }
}
