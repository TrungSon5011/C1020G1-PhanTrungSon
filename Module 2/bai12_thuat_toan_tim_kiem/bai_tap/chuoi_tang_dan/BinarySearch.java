package C1020G1.thuat_toan_tim_kiem.bai_tap.chuoi_tang_dan;

public class BinarySearch {
    public static int binarySearch(int [] arr,int l, int r,int x){
            if(r >= l){
                int mid = l + (r -1)/2;
                if(arr[mid] == x){
                    return mid;
                }
                if(arr[mid] > x){
                    return binarySearch(arr,l, mid -1,x);
                }
                return binarySearch(arr,mid +1,r, x);
            }
        return  -1;
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,45,6,5,7,43,423,1,324,435,4564,2324};
        int n = array.length -1;
        int x = 7;
        int result = binarySearch(array,0, n,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
