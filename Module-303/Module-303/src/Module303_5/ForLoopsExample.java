package Module303_5;

import java.util.ArrayList;
import java.util.List;

public class ForLoopsExample {
    public static void main(String[] args){
        for(int count=0;count<10;count++){
            System.out.println("I am running my for loop " +count+ " times");
        }

        String[] strings={"one","two","three","four","five"};
//        for(int position=0;position<strings.length;position++){
//            System.out.println("String at "+position+ " is " +strings[position]);
//        }
        for(String value:strings){
            System.out.println(value);
        }
        String characters="sushma";
        for(int position=0;position<characters.length();position++){
            System.out.println("character at "+position+ " is " +characters.charAt(position));
        }
        List<String> stringList= new ArrayList<>();
        stringList.add("sushma");
        stringList.add("Jayasree");
        stringList.add("Yerragunta");
        for(int position=0;position<stringList.size();position++){
            String value=stringList.get(position);
            System.out.println("String at "+position+ " is " +value);
        }
        for(String value:stringList){
            //this is a new style for loop which says value in the stringlist
            System.out.println("new for loop style " +value);

        }


    }
}
