package org.example.thirdWeek;

public class anagram {

    public static void main(String[] args) {
        String word = "abcd";


        System.out.println("changeFirstAndLast(word) = " + changeFirstAndLast(word));


    }

    public static String changeFirstAndLast(String word){
        String newWord = word.replaceFirst(word.charAt(0)+"",
                word.charAt(word.length()-1)+"");
        //dbcd

        newWord= newWord.replaceFirst(newWord.charAt(word.length()-1)+"",
                word.charAt(0)+"");

        System.out.println(newWord);

        return newWord;
    }









}
