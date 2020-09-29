package com.design.pattern.decorator;

public class DoubleBed implements HotelBooking {

    private static final String roomBookingInfo = "Double Bed";
    private static final double cost = 700d;

    @Override
    public String getInfo() {
        return roomBookingInfo;
    }

    @Override
    public double getCost() {
        return cost;
    }

}
