package org.example.thirdWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaTasks9 {

    public static void main(String[] args) {

        //First Question: Concatenate Arrays
//        int[] first = {1,2,3,4,9,87,33};
//        int[] second = {5,6,7,8,21,123,123};
//        int[] finalArray = concat2Arrays(first,second);
//        System.out.println("finalArray = " + Arrays.toString(finalArray));


//        Second Question: remove Ahmad

//        List<String> listOfEmployees = new ArrayList<>(Arrays.asList("Ahmad","Mahmood","Sujood","ahmad"));
//
//        System.out.println("removeAhmad(listOfEmployees) = " + removeAhmad(listOfEmployees));
//        System.out.println("listOfEmployees = " + listOfEmployees);



//      Third Question: Remove All greater than 100
        List<Integer> listOfEmployees = new ArrayList<>(Arrays.asList(1,2,300,44,99,550,900,-1));
        System.out.println("removeAllGreaterThan100(listOfEmployees) = " + removeAllGreaterThan100(listOfEmployees));







    }


    public static int[] concat2Arrays(int[] a, int[] b){

        int[] concatenated = new int[a.length+ b.length];

        int secondArrayIndex = 0;
        for (int i = 0; i < concatenated.length; i++) {
            if (i<a.length){
                concatenated[i] = a[i];
            }else {
                concatenated[i] = b[secondArrayIndex];
                secondArrayIndex++;
            }

        }



        return concatenated;

    }

    public static List<String> removeAhmad(List<String> list){
        ArrayList<String> ahmadRemoveList = new ArrayList<>(list);

        ahmadRemoveList.removeIf(p->p.equalsIgnoreCase("ahmad"));

        return ahmadRemoveList;
    }


    public static List<Integer>removeAllGreaterThan100(List<Integer> list){
        List<Integer> withRemovedItems = new ArrayList<>(list);
        withRemovedItems.removeIf(v -> v>100);
        return withRemovedItems;
    }






}
