package blatt03;

import java.util.Objects;

public class Auto {
    private String color;
    public double speed;

    public Auto(String color, double speed) {
        this.color = color;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        Auto auto = (Auto) o;
        return (this.color.equals(auto.color) && (this.speed == auto.speed));
    }

//    @Override
//    public String toString() {
//        return "Auto{" +
//                "color='" + color + '\'' +
//                ", speed=" + speed +
//                '}';
//    }
}
