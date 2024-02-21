package org.example;

import java.util.Random;

public class Animal {
    public static void main(String[] args) {

//        System.out.println("isValidPassword? = " + isValidPassword("ank@Aa"));
//
//        int[] numArray = {1,5,6,34,123,320,98};
//        System.out.println("findMaximum(numArray) = " + findMaximum(numArray));

        System.out.println("sumOfDigitsInString = " + sumOfDigitsInString("12afaew33adfa"));

    }

    public static boolean isValidPassword(String password){
        char[] passArray = password.toCharArray();
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialCharacter = false;
        boolean containsDigit = false;
        boolean has6OrMoreCharacters = false;
        boolean doesNotHaveSpace = false;


        if(password.length()>=6){
            has6OrMoreCharacters = true;
        }
        if(!password.contains(" ")){
            doesNotHaveSpace = true;
        }

        for (int i = 0; i < passArray.length; i++) {

            if(passArray[i]>=65 && passArray[i]<=90){
                hasUpperCase = true;
            }
            else if(passArray[i]>=97 && passArray[i]<=122){
                hasLowerCase = true;
            }
            else if(passArray[i]>=48 && passArray[i]<=57){
                containsDigit = true;
            }
            else{
                hasSpecialCharacter =true;
            }
        }


        if(has6OrMoreCharacters && doesNotHaveSpace && hasUpperCase &&
        hasLowerCase && containsDigit && hasSpecialCharacter){return true;}



        return false;
    }









//Array -- Find Maximum
//Write a method that can find the maximum number from an int Array
//String -- sum of digits in a string
//Write a method that can return the sum of the digits in a strin



    public static int findMaximum(int[] numArray){
        int max = -2147483648;

        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i]>max)
                max = numArray[i];
        }
        return max;
    }




    public static int sumOfDigitsInString(String word){
        int total =0;

        for (char each : word.toCharArray()) {
            if(each>=48 && each<=57){
                total = total + Character.getNumericValue(each);
            }
        }

        return total;
    }











}