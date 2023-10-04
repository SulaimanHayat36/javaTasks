package org.example;

public class Second {
    public static void main(String[] args) {



        int[] divisibles = {3,5,15};


        for (int i = 0; i<divisibles.length; i++) {
            System.out.print("Divisible by " + divisibles[i] + ": ");

            for (int j = 1; j <= 100; j++) {
                boolean isDivisibleBy15 = j % 3 == 0 && j % 5 == 0 && j % 15 == 0;
                boolean isDivisibleBy5 = j % 5 == 0 && j % 15 != 0;
                boolean isDivisibleBy3 = j % 3 == 0 && j % 15 != 0;


                /*switch (divisibles[i]) {
                    case 3:
                        if (isDivisibleBy3) {
                            System.out.print(j + " ");
                        }
                        break;
                    case 5:
                        if (isDivisibleBy5) {
                            System.out.print(j + " ");
                        }
                        break;
                    case 15:
                        if (isDivisibleBy15) {
                            System.out.print(j + " ");
                        }
                        break;
                    default:
                        // Handle other cases if needed
                        break;
                }*/


                if(divisibles[i] == 3 && isDivisibleBy3){
                    System.out.print(j+" ");
                }
                else if(divisibles[i] == 5 && isDivisibleBy5){
                    System.out.print(j+" ");
                }
                else if(divisibles[i] == 15 && isDivisibleBy15){
                        System.out.print(j+" ");
                }

            }
            System.out.println();
        }



        







    }
}
