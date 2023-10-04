package org.example;

public class third {
    public static void main(String[] args) {

        int a =43;

        for (int i = 1; i <= a; i++) {
            boolean divisibleByOne = i%2==0 || i%3 ==0 || i%5==0;
            boolean divisibleByTwo = (i%2==0 && i%3 ==0) || (i%2==0 && i%5==0)
                                        ||(i%3==0 && i%5 ==0) ;


            boolean divisibleByAll = i%2==0 && i%3 ==0 && i%5==0;

            if(divisibleByOne){
                if(divisibleByAll){
                    System.out.println("CodilityTestCoders");
                    continue;
                }
                if(i%2==0){
                    System.out.print("Codility");
                }
                if(i%3==0) {
                    System.out.print("Test");
                }
                if(i%5==0){
                    System.out.print("Coders");
                }
                System.out.println();
            }else{
                System.out.println(i);
            }




        }







    }
}
