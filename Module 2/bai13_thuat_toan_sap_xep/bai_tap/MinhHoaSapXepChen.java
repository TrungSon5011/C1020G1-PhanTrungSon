package C1020G1.thuat_toan_sap_xep.bai_tap;
import java.util.Arrays;
public class MinhHoaSapXepChen {
    public static void main(String[] args) {
        int [] array = {1,22,5,45,323,0,19,17,13123};
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            while (j <= i){
                if(array[i] < array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    System.out.println("Swap "+array[i] + " and "+array[j]);
                }
                j++;
            }
//            for(int j = i+1; j < array.length;j++){
//                if(array[i] > array[j]){
//                    int temp = array[j];
//                    array[j] = array[i];
//                    array[i] = temp;
//                    System.out.println("Swap "+array[i] + " and "+array[j]);
//                }
//            }
            System.out.println("Array after sort "+(i+1)+": "+ Arrays.toString(array));

        }
        System.out.println("Array after sort: "+ Arrays.toString(array));
    }
}
