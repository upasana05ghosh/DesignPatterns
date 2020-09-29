package com.design.pattern.decorator;

public class HotelWifi implements HotelDecorator{

    private static final String hotelDecoratorInfo = "Wifi";
    private static final double cost = 50d;

    HotelBooking hb;

    public HotelWifi(HotelBooking hb) {
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
