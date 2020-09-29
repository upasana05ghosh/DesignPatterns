package com.design.pattern.decorator;

public class HotelSpa implements HotelDecorator{

    private static final String hotelDecoratorInfo = "Spa Center";
    private static final double cost = 700d;

    HotelBooking hb;

    public HotelSpa(HotelBooking hb) {
        this.hb = hb;
    }

    @Override
    public String getInfo() {
        return hb.getInfo() + " | " + hotelDecoratorInfo;
    }

    @Override
    public double getCost() {
        return hb.getCost() + cost;
    }

}
