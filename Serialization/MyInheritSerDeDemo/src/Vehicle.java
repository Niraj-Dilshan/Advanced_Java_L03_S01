import java.io.Externalizable;

public class Vehicle {
    private String color;

    public Vehicle(){};

    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
