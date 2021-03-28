package blatt03_1;

public class Auto {

    private String color;
    private int speed;


    public Auto(String color, int speed){
        this.color = color;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o){
        Auto auto = (Auto)o;
        return this.getColor().equals(auto.getColor()) && (this.getSpeed() == auto.getSpeed());
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
