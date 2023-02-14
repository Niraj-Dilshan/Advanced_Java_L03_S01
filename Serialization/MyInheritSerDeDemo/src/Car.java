import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car extends Vehicle implements Externalizable {

    private static final long serialVersionUID = 1919L;
    private double speed;

    private transient int year;

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
        out.writeInt(getYear());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //Parent Class
        setColor((String) in.readObject());
        //Child Class
        setSpeed(in.readDouble());
        setYear(in.readInt());
    }

    @Override
    public String toString() {
        return "Car{ " +
                "Color = " + getColor() +","+
                " speed = " + speed +","+
                " year = " + getYear() +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
