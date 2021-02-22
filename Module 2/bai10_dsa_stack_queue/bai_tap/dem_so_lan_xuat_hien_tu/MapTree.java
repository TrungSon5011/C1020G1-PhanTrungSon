package C1020G1.dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_tu;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = scanner.nextLine();
        Map<String,Integer> map = new TreeMap<>();
        String [] words = string.split("\\s");

        for (String word : words) {
            if(!map.containsKey(word)){
                map.put(word,1 );
            }else{
                map.replace(word,map.get(word)+1);
            }
        }
        System.out.println(map.entrySet());
    }
}
