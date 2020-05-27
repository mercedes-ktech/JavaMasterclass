import java.io.*;
import java.rmi.server.ExportException;

public class ReadAFile {

    public static void main(String[] args) throws IOException {
        File myFile = new File("MyText.txt");
        FileReader fileReader = new FileReader(myFile);
        BufferedReader reader = new BufferedReader(fileReader);

        try {
            String line = null; //make a string variable to hold each line as the line is read

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
