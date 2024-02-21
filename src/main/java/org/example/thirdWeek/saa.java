package org.example.thirdWeek;

public class saa {
    public static void main(String[] args) {
        String a = "jdbc:postgresql://room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws.com:5432/room_reservation_qa";
        String b = "jdbc:postgresql://room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws.com:5432/room_reservation_qa";
        System.out.println(a.equals(b));
    }
}
