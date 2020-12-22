package C1020G1.text_file.bai_tap.country;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private static final String FILEPATH_COUNTRY = "src/C1020G1/text_file/bai_tap/country/country.csv";
    public static List<String> readFile(String filePath){
        List<String> countryListString = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null ){
                countryListString.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countryListString;
    }
    public static void main(String[] args) {
       List<String> listCountry = readFile(FILEPATH_COUNTRY);
        for (int i = 0; i < listCountry.size(); i++) {
            String [] temp = listCountry.get(i).split(",");
            String country = temp[5];
            System.out.println(country);
        }
    }
}
