package C1020G1.text_file.bai_tap.copy;

import java.io.*;

public class CopyFile {
    public static final String FILE_1 = "src/C1020G1/text_file/bai_tap/copy/file_1.csv";
    public static final String FILE_2 = "src/C1020G1/text_file/bai_tap/copy/file2.csv";
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            FileReader fileReader = new FileReader(FILE_1);
            bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(FILE_2);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        finally{
            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
