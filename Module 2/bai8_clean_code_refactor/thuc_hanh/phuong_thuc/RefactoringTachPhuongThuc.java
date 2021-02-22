package C1020G1.clean_code_refactor.thuc_hanh.phuong_thuc;

public class RefactoringTachPhuongThuc {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
    private static double getPerimeter(int radius){
        return 2 * Math.PI  * radius;
    }

}
