import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    FileOutputStream fos;
    ObjectOutputStream oos;
    //to serialize Cat
    public void serializeCat(Cat c){
        try {
            fos = new FileOutputStream("F:\\B04APIJ\\cat.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
            oos.flush();
            fos.close();
            oos.close();
        }catch (Exception e){
            System.out.println("Exception occured : " + e.getMessage());
        }

    }

    public void serializeUniversityEmployee(UniversityEmployee u) {
        try {
            fos = new FileOutputStream("F:\\B04APIJ\\ue.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(u);
            oos.flush();
            fos.close();
            oos.close();
        } catch (Exception e) {
            System.out.println("Exception occured : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
