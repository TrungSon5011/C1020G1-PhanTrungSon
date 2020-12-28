package csv;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadCSVExample {
    public static void main(String[] args) throws FileNotFoundException {
        CSVReader reader;
        reader = null;
        try {
            reader = new CSVReader(new FileReader("/Users/phantrungson/Documents/java/csv/testCsv.csv"), ';');
            System.out.println(reader.getParser().getSeparator());
            String [] nextLine;
            while ((nextLine = reader.readNext()) != null){
                for(String token : nextLine){
                    System.out.print(token);
                    System.out.print("\t");
                }
                System.out.println("\n");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
