package C1020G1.text_file.thuc_hanh;

import java.io.*;

public class ReadFileExample {
    public static void readFileText(String filePath){
        File file = new File(filePath);
        if(!file.exists()){
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine())!= null){
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Sum = "+sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFileText("src/C1020G1/text_file/thuc_hanh/thuchanh.txt");
    }
}
