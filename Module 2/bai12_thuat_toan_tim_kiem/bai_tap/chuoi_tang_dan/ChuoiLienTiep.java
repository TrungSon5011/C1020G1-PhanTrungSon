package C1020G1.thuat_toan_tim_kiem.bai_tap.chuoi_tang_dan;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ChuoiLienTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> list = new LinkedList<>();
        List<Character> maxSubstring = new LinkedList<>();
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if(list.size() >1 && string.charAt(i) <= ((LinkedList<Character>) list).getLast() &&
            list.contains(string.charAt(i))){
                list.clear();
            }
            list.add(string.charAt(i));
            if(list.size() > maxSubstring.size()){
                maxSubstring.clear();
                maxSubstring.addAll(list);
            }
        }
        for(Character display : maxSubstring){
            System.out.print(display);
        }

    }
}
