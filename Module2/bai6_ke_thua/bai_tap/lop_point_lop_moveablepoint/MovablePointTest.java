package C1020G1.ke_thua.bai_tap.lop_point_lop_moveablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(12.0f,132.4f,23.45f,223.3f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
