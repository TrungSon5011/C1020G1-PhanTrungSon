package C1020G1.regex.thuc_hanh.validate_email;

public class EmailRegex {
    public static boolean checkEmail(String str){
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        return str.matches(regex);
    }
}
