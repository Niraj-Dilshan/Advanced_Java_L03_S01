import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Used to write data to the file
public class MyFileWriter {
    File myFile;
    FileOutputStream mfos;
    String myData;

    public void writeToMyFile(){
        myFile = new File("myFile.txt"); //Location of your file with name and type
        myData = "Hello myFile...!!!";
        try{
            mfos = new FileOutputStream(myFile);
            mfos.write(myData.getBytes());
            mfos.flush();
            mfos.close();
        } catch (FileNotFoundException e){
            System.out.println("My file not found..." + e.getMessage());
        } catch (IOException e) {
            System.out.println("Failure in write operation..." + e.getMessage());
        } catch (Exception e) {
            System.out.println("Failure..." + e.getMessage());
        }
    }
}
