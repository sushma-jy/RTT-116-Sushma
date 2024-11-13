package Homework.GLAB303_11_5;

import java.util.TreeSet;
public class TreeSetExampleCom {
    public static void main(String[] args) {

        TreeSet<String> cities = new TreeSet<>(new cities_Comparator());

        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        System.out.println("TreeSet: " + cities);
    }
}
