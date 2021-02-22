package csv;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteData {
    public static void writeDataLineByLine(String filePath){
        File file = new File(filePath);

        try {
            FileWriter outputFile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputFile);
            String [] header = {"Thinh","Son","Marks"};
            writer.writeNext(header);
            String [] data1 = {"Aman","c10","78"};
            writer.writeNext(data1);
            String [] data2 = {"Ann", "c10","90"};
            writer.writeNext(data2);
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void writeDataAtOnce(String filePath){
        File file = new File(filePath);
        try{
            FileWriter outPutFile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outPutFile);
            List<String[]> data = new ArrayList<>();
            data.add(new String [] {"name","class","marks"});
            data.add(new String[] { "Aman", "10", "620" });
            data.add(new String[] { "Suraj", "10", "630" });
            writer.writeAll(data);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void writeDataForCustomSeperatorCSV(String filePath){
        File file = new File(filePath);
        try {
            FileWriter outputFile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputFile,'\t',
                    CSVWriter.NO_ESCAPE_CHARACTER,CSVWriter.DEFAULT_ESCAPE_CHARACTER,CSVWriter.DEFAULT_LINE_END);
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] { "Name", "Class", "Marks" });
            data.add(new String[] { "Aman", "10", "620" });
            data.add(new String[] { "Suraj", "10", "630" });
            writer.writeAll(data);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeDataLineByLine("/Users/phantrungson/Documents/java/csv/TestWriting.numbers");
        System.out.println("done");
//        writeDataAtOnce("/Users/phantrungson/Documents/java/csv/Untitled.numbers");
        writeDataForCustomSeperatorCSV("/Users/phantrungson/Documents/java/csv/Untitled.numbers");
    }
}
//"/Users/phantrungson/Documents/java/csv/TestWriting.numbers"