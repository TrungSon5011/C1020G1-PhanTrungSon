package C1020G1.text_file.thuc_hanh;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File myObj = new File("src/C1020G1/binary_file/thuc_hanh/file_source.rar");
        try {
            if(myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
            }else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
