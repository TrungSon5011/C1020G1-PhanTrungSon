package C1020G1.Array.BaiTap;
import java.util.Scanner;
import java.lang.String;
public class DemSoLanXuatHienCuaKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strd = "I love you";
        System.out.println("Enter a character: ");
        String chad = scanner.nextLine();
        int length = strd.length();
        int count = 0;
            for(int j = 0;  j < length;j++){
                if(chad.charAt(0) == strd.charAt(j) ){
                    count ++;
                }
        }
        System.out.println(count);
    }
}
