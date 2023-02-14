import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car extends Vehicle implements Externalizable {
    private double speed;

    public Car(){};

    public Car(String color, double speed) {
        super(color);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //Parent Class
        out.writeObject(getColor());
        //Child Class
        out.writeDouble(getSpeed());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //Parent Class
        setColor((String) in.readObject());
        //Child Class
        setSpeed(in.readDouble());
    }

    @Override
    public String toString() {
        return "Car{" +
                "Color = " + getColor() +","+
                " speed = " + speed +
                '}';
    }
}
