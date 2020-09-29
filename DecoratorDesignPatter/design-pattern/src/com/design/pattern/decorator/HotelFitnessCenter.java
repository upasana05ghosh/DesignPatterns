package com.design.pattern.decorator;

public class HotelFitnessCenter implements HotelDecorator{

    private static final String hotelDecoratorInfo = "Fitness Center";
    private static final double cost = 100d;

    HotelBooking hb;

    public HotelFitnessCenter(HotelBooking hb) {
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
