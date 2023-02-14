import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UniversityEmployee extends Employee implements Serializable {
    private int uId;

    public UniversityEmployee(String name, int age, int uId) {
        super(name, age);
        this.uId = uId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    private void writeObject(ObjectOutputStream ous) throws IOException {
        ous.defaultWriteObject();
        ous.writeObject(getName());// --> 01 , Employee name is a String, String is an Object
        ous.writeInt(getAge());//--> 02, Employee age is int
    }

    private void readObject(ObjectInputStream ois) throws ClassNotFoundException,IOException{
        ois.defaultReadObject();
        setName((String)ois.readObject());// --> 01
        setAge(ois.readInt());// --> 02
        // You need to maintain the same order as writeObject
    }

    @Override
    public String toString() {
        return "UniversityEmployee{" +
                "name = " + getName() +
                "  ,  age = " + getAge() +
                "  ,  uId = " + uId +
                '}';
    }
}
