package com.epam.test.YuliyaKanonchyk.entity;

import java.util.EnumSet;
import java.util.Random;
import java.util.Set;

public class PassengerWagon {

    private enum wagonEnum {
        PASSENGER_WAGON_1,
        PASSENGER_WAGON_2,
        PASSENGER_WAGON_3,
        PASSENGER_WAGON_4;
    }

  Set<wagonEnum> passWagon = EnumSet.allOf(wagonEnum.class);

  Random random=new Random();
  int passNum = random.nextInt(100);
  int luggNum = random.nextInt(100);
  boolean cafWag = random.nextBoolean();

  public final int MAX_SEATS_NUMBER=70;
  private int passengersNumber = passNum;
  public final int MAX_PASSENGER_NUMBER = 100;
  public final int MAX_LUGGAGE_NUMBER = 100;
  boolean isCafeWagon = cafWag;

  PassengerWagon() {
  }
    PassengerWagon(int passengersNumber, boolean isCafeWagon, int luggNum) {
        this.passengersNumber = passengersNumber;
        this.isCafeWagon = isCafeWagon;
        this.luggNum = luggNum;
    }

    @Override
    public String toString() {
        return "PassengerWagon{" +"passWagon=" + passWagon +'}';
    }


}
