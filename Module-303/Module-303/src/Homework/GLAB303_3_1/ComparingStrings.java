package Homework.GLAB303_3_1;

public class ComparingStrings {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3="hemlo";
        String s4="flag";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
        
        String s5="PerScholas";
        String s6="PerScholas";
        String s7=new String("PerScholas");
        String s8 ="Teksystem";
        System.out.println(s5.equals(s6));//true
        System.out.println(s5.equals(s7));//true
        System.out.println(s5.equals(s8));//false
        System.out.println(s5==s6);//true (because both refer to same instance)
        System.out.println(s5==s7);//false(because s3 refers to instance created in nonpool)

        String s9 ="Perscholas";
        String s10="Perscholas";
        String s11="Perschola";
        String s12="PerscholasX";
        System.out.println(s9.compareTo(s10)); //0
        System.out.println(s9.compareTo(s11)); // 1(because s9>s11)
        System.out.println(s9.compareTo(s12)); // -1(because s9<s12 )




    }
}
