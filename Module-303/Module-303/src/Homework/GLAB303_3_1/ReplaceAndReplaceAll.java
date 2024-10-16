package Homework.GLAB303_3_1;

public class ReplaceAndReplaceAll {
    public static void main(String[] args) {
        String str1 = "abc cba";
        String str2 = "Java123is456fun";
        System.out.println(str1.replace('a', 'z'));
        System.out.println("Lava".replace('L', 'J'));
        System.out.println("Hello".replace('4', 'J'));
        System.out.println(str1.replace("C++", "Java"));
        System.out.println("aa bb aa zz".replace("aa", "zz"));
        System.out.println("Java".replace("C++", "C"));
        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str2.replaceAll(regex, " "));

    }
}
