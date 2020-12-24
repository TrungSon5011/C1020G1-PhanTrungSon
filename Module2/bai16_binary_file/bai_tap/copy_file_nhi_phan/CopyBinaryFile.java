package C1020G1.binary_file.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    private static final String FILEPATH_1 = "src/C1020G1/binary_file/bai_tap/copy_file_nhi_phan/file2.txt";
    private static final String FILEPATH_2 = "src/C1020G1/binary_file/bai_tap/copy_file_nhi_phan/file1.txt";
    public static void writeFile(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILEPATH_1);
            System.out.println("Enter a string: ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            byte [] bytes = str.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            System.out.println("Success!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyFile(){
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(FILEPATH_1));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(FILEPATH_2));
            int length ;
            int count = 0;
            byte[] buffer = new byte[1024];
            while ((length = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
            System.out.println(count);
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeFile();
        copyFile();
    }
}
