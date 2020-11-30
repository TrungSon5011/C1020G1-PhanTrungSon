package C1020G1.Loop.BaiTap;

public class HienThiSoNguyenTo {
    public static void main(String[]args){
        int count = 0;
        int n = 0;
        while(count <= 20){
            if(checkPrimeNumber(n)){
                System.out.print(n +" ");
                count++;
            }
            n ++;
        }
    }
    public static boolean checkPrimeNumber(int num ){
        boolean test = true;
        if(num < 2){
            test = false;
        }else{
            for(int i = 2; i < num;i++){
                if(num % i == 0){
                    test = false;
                }
            }
        }
        return test;
    }
}
