package Module303_11;

import java.util.*;

public class ListSetExample {
    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(3);
        intList.add(2);

        for(Integer i:intList){
            System.out.println(i);
        }

        System.out.println("=========================");

        // first we need to get the iterator from the list
        Iterator<Integer> iterator = intList.iterator();

        // loop over the list using an iterator, we check to make sure the iterator (list) has a next element
        while ( iterator.hasNext()) {
            // the .next function is actually 2 operations, first is to return the element at the pointer and second to move the pointer over 1 element
            Integer i = iterator.next();

            // primary use for an iterator is when you want to remove something from the list while you are iterating the list
            if ( i == 3 ) {
                // this is the correct way of removing an item from the list while looping over the list
                iterator.remove();
            }
        }


        Set<Integer> intSet=new HashSet<>();
        intSet.add(1);
        intSet.add(3);
        intSet.add(2);
        intSet.add(4);
        intSet.add(4);
        intSet.add(0);
        for(Integer i:intSet){
            System.out.println(i);
        }


    }
}
