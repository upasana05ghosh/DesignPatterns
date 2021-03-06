package com.design.pattern.decorator;

public class HotelPool implements HotelDecorator{

    private static final String hotelDecoratorInfo = "Pool";
    private static final double cost = 700d;

    HotelBooking hb;

    public HotelPool(HotelBooking hb) {
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
