package org.perscholas;

public class StringNullsExample {
    public static void main(String[] args) {
        String str = null;
        String s1="a";
        if (str == null) {
            System.out.println("str is null");
        }
//        str.toLowerCase();
        if(str==null||str.length()==0){
            System.out.println("str is empty");
        }
        if(str!=null && str.equals(s1)){
            System.out.println("will never print bcoz null is not equal to empty string");
        }else{
            System.out.println("null is not equal to empty string");
        }
        if(s1.equals(str)){
            System.out.println("will never print bcoz null is not equal to empty string");
        }else{
            System.out.println("null is not equal to empty string");
        }
    }
}
