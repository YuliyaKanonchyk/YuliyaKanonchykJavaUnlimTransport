package com.epam.test.YuliyaKanonchyk.entity;

public class PassengerWagon implements Wagon {

    public enum WagonType {
        PLATSKART,
        KUPE,
        RESTORAN;
    }

    private WagonType wagonType;
    private int passangers;
    private int luggages;

    public PassengerWagon(WagonType wagonType) {
        this.wagonType = wagonType;
    }

    @Override
    public void fillRandomly() {
        passangers = (int) (Math.random() * 100);
        luggages = (int) (Math.random() * 100);
    }

    @Override
    public int getPassengers() {
        return passangers;
    }

    @Override
    public int getLuggeges() {
        return luggages;
    }

    public WagonType getWagonType() {
        return wagonType;
    }

    @Override
    public String toString() {
        return "PassengerWagon{" +
                "wagonType=" + wagonType +
                ", passangers=" + passangers +
                ", luggages=" + luggages +
                '}';
    }
}
