package org.example;

import java.util.Arrays;
import java.util.Random;

public class JavaTask8 {

    public static void main(String args[]){

        int initialSpecifiedLength = 6;

        if(1>initialSpecifiedLength && initialSpecifiedLength > 100){
            System.out.println("Nope!");
            System.exit(1);
        }
        
        int numberOfPositive = getRandomIntInRange(1,initialSpecifiedLength-1);
        int[] positiveNumbersArray = new int[numberOfPositive];

        for (int i = 0; i < positiveNumbersArray.length; i++) {
            positiveNumbersArray[i] = getRandomIntInRange(1,100);
        }


        int numberOfNegative = getRandomIntInRange(1,initialSpecifiedLength - numberOfPositive);
        int[] negativeNumbersArray = new int[numberOfNegative];


        System.out.println("Total of positive numbers "+sumOfAllElements(positiveNumbersArray));

        while (sumOfAllElements(negativeNumbersArray) != (-1 * sumOfAllElements(positiveNumbersArray))) {
            for (int i = 0; i < numberOfNegative; i++) {
                negativeNumbersArray[i] = (getRandomIntInRange(1,sumOfAllElements(positiveNumbersArray))) * -1;
            }
        }
        int[] finalArray = concat2Arrays(negativeNumbersArray,positiveNumbersArray);

        System.out.println("finalArray = " + Arrays.toString(finalArray));

        }






    public static int sumOfAllElements(int[] array){
        int sum = 0;
        for (int i : array) {
            sum = sum+i;
        }
        return sum;

    }
    public static void moveZerosToTheEnd(int[] originalArray){
        System.out.println(Arrays.toString(originalArray));

        int otherNumbersCounter = 0;
        int zeroCounter = 0;

        for (int i : originalArray) {
            if(i==0)
                zeroCounter++;
            else
                otherNumbersCounter++;
        }

        int[] otherNumbersArray = new int[otherNumbersCounter];
        int[] zerosArray = new int[zeroCounter];


        int othersIndex = 0;
        int zeroIndex = 0;
        for(int each:originalArray){
            if(each==0){
                zerosArray[zeroIndex] = 0;
                zeroIndex++;
            }
            else{
                otherNumbersArray[othersIndex] = each;
                othersIndex++;
            }

        }

        System.out.println("others : "+Arrays.toString(otherNumbersArray));
        System.out.println("zeros : "+Arrays.toString(zerosArray));


        int[] combined = new int[otherNumbersArray.length+zerosArray.length];

        int secondArrayIndex=0;
        for (int i = 0; i < combined.length; i++) {
            if(i<otherNumbersArray.length){
                combined[i] = otherNumbersArray[i];
            }
            else{
                combined[i] = zerosArray[secondArrayIndex];
                secondArrayIndex++;
            }
        }

        System.out.println("combined = " + Arrays.toString(combined));


    }


    public static int getRandomIntInRange(int min, int max){

        return new Random().nextInt((max - min) + 1) + min;

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



}
