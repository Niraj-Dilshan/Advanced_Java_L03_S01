import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandlingRecapDemo {
    public static void main(String[] args) {

        //1st method
        //Write to the file
        MyFileWriter mfw = new MyFileWriter();
        mfw.writeToMyFile();

        //Read from the file
        MyFileReader mfr = new MyFileReader();
        mfr.readFromMyFile();


        //2nd Method
        // Define file path
        String filePath = "resource.txt";

        // Write to file
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("Hello World!");
            writer.close();
            System.out.println("\nFile written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }

        // Read from file
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
            System.out.println("File read successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading from file.");
            e.printStackTrace();
        }
    }

}

