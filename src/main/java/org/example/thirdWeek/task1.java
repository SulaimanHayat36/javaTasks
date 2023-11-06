package org.example.thirdWeek;

import java.util.*;

public class task1 {


    public static void main(String[] args) {
        String name = "Ahmad";


        System.out.println();









    }

    public static boolean ispalindrome(String word){
        String reversed= new StringBuilder(word).reverse().toString();
        if(word.equalsIgnoreCase(reversed)){
            return true;
        }
        return false;
    }

}
