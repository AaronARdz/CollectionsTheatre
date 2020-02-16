package com.AaronMasterClass;

public class Main {

    public static void main(String[] args) {
        Theatre cinepolis = new Theatre("Cinepolis", 8,20);
//        cinepolis.getSeats();
        if (cinepolis.reservedSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
