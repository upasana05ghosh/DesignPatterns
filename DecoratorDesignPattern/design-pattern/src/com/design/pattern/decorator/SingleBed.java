package com.design.pattern.decorator;

public class SingleBed implements HotelBooking {

    private static final String roomBookingInfo = "Single Bed";
    private static final double cost = 500d;

    @Override
    public String getInfo() {
        return roomBookingInfo;
    }

    @Override
    public double getCost() {
        return cost;
    }

}
