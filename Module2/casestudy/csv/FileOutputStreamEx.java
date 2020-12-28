package csv;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Users/phantrungson/Documents/java/csv/testCsv.csv");
            String s = "Let's start write in csv";
            byte b[]=s.getBytes();//converting string into byte array
            fileOutputStream.write(b);
            fileOutputStream.close();
            System.out.println("success...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
