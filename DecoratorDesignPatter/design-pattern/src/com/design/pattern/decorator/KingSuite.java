package com.design.pattern.decorator;

public class KingSuite implements HotelBooking {

    private static final String roomBookingInfo = "King Suites";
    private static final double cost = 5000d;

    @Override
    public String getInfo() {
        return roomBookingInfo;
    }

    @Override
    public double getCost() {
        return cost;
    }

}
