package Homework.GLAB303_3_1;

public class ContainsMethod {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        Boolean result;
        result = str1.contains("Java");
        System.out.println(result);  // true
        result = str1.contains("Python");
        System.out.println(result);  // false
        result = str1.contains("");
        System.out.println(result);  // true

    }
}
