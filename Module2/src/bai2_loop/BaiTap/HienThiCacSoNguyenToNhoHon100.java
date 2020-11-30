package C1020G1.Loop.BaiTap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n = 0;
        while(n < 100){
            if(checkPrimeNumber(n)){
                System.out.print(n+" ");
            }
            n++;
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
