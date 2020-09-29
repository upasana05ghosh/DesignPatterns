package com.design.pattern.decorator;

public class BookHotel {

    public static void main(String[] args) {
        HotelBooking hb = new KingSuite();
        hb = new HotelWifi(hb);
        hb = new HotelSpa(hb);
        hb = new HotelFitnessCenter(hb);
        double cost = hb.getCost();
        System.out.println(cost);
        System.out.println(hb.getInfo());
    }

}
