package C1020G1.access_modifier.thuc_hanh.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        Student.change();
        s1.display();
        s2.display();
        s3.display();
    }
}
