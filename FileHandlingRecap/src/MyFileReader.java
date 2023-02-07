import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Used to read data from the file
public class MyFileReader {
    File myFile;
    FileInputStream mfis;

    public void readFromMyFile(){
        myFile = new File("myFile.txt"); //Location of your file with name and type
        int i =0;
        try{
            mfis = new FileInputStream(myFile);
            while ((i = mfis.read()) != -1){
                System.out.print((char)i);
            }
        }catch (FileNotFoundException e){
            System.out.println("My file not found..." + e.getMessage());
        } catch (IOException e) {
            System.out.println("Failure in read operation..." + e.getMessage());
        } catch (Exception e) {
            System.out.println("Failure..." + e.getMessage());
        }
    }
}
