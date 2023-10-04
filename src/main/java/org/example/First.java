package org.example;

public class First {
    public static void main(String[] args) {

        //swap two variable values without using a third variable

        int first = 11;
        int second = 23;

        first = first + second;
        second = first - second;
        first = first-second;

        System.out.println(first);
        System.out.println(second);




    }


    //Dumb way q1
    /*
    public static Object[] swapIntegers(Object first, Object second){
        Object[] swapable = {second,first};
        return swapable;
    }
    */


}