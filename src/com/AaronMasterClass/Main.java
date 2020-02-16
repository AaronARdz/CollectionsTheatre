package com.AaronMasterClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre cinepolis = new Theatre("Cinepolis", 8,20);
        List<Theatre.Seat> seatCopy = new ArrayList<>(cinepolis.seats);
        printList(seatCopy);

        seatCopy.get(5).reserve();
        if (cinepolis.reservedSeat("A06")){
            System.out.println("Please pay for A06");
        } else {
            System.out.println("Seat already reserved");
        }

        System.out.println("=============================0");

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing cinepolis.seats");
        printList(cinepolis.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        System.out.println("==========================");

        sortList(seatCopy);
        System.out.println("Printing homemade sorted seatCopy ");
        printList(seatCopy);

        //Collections.copy needs an already filled up list to copy, so, next line wont work
//        List<Theatre.Seat> voidList = new ArrayList<>(cinepolis.seats.size());
//        Collections.copy(voidList,cinepolis.seats);


//        cinepolis.getSeats();
//        if (cinepolis.reservedSeat("H11")){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=================================");
    }
    public static void sortList(List<? extends Theatre.Seat> list){
        for (int i = 0; i <list.size() - 1; i++){
            for (int j = i+1; j < list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i ,j);
                }
            }
        }
    }
}
