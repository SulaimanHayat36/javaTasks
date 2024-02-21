package org.example.thirdWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javatask10 {

    public static void main(String[] args) {
//        ArrayList - sorting in ascending
//        Write a method that can sort the ArrayList in Ascending order without using the sort method
        List<Integer> a = new ArrayList<>(Arrays.asList(2,3,4,4,12,7));
        System.out.println("a = " + a);
        List<Integer> sorted = new ArrayList<>();

        for (Integer integer : a) {
            int current = integer;
            if(sorted.isEmpty()){
                sorted.add(integer);
                continue;
            }
            if (current<integer){


            }



        }




    }
}
