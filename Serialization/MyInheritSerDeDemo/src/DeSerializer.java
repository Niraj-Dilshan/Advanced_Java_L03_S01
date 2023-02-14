import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializer {
    FileInputStream fis;
    ObjectInputStream ois;
    public void deserializeCat(){
        try {
            fis = new FileInputStream("F:\\B04APIJ\\cat.ser");
            ois = new ObjectInputStream(fis);
            Cat c = (Cat) ois.readObject();
            System.out.println(c.toString());

        }catch (Exception e){
            System.out.println("Exception occured : " + e.getMessage());
        }
    }

    public void deserializeUniversityEmployee(){
        try {
            fis = new FileInputStream("F:\\B04APIJ\\ue.ser");
            ois = new ObjectInputStream(fis);
            UniversityEmployee u = (UniversityEmployee) ois.readObject();
            System.out.println(u.toString());

        }catch (Exception e){
            System.out.println("Exception occured : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
