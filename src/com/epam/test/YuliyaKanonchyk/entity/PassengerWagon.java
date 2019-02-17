package com.epam.test.YuliyaKanonchyk.entity;

import java.util.EnumSet;
import java.util.Random;
import java.util.Set;

public enum PassengerWagon {
  PASSENGER_WAGON_1,
  PASSENGER_WAGON_2,
  PASSENGER_WAGON_3,
  PASSENGER_WAGON_4;

  Set<PassengerWagon> passWagon = EnumSet.allOf(PassengerWagon.class);

  Random random=new Random();
  int passNum = random.nextInt(100);
  boolean cafWag = random.nextBoolean();

  public final int MAX_SEATS_NUMBER=70;
  private int passengersNumber = passNum;
  public final int MAX_PASSENGER_NUMBER = 100;
  boolean isCafeWagon = cafWag;

  PassengerWagon() {
  }

  PassengerWagon(int passengersNumber, boolean isCafeWagon) {
    this.passengersNumber = passengersNumber;
    this.isCafeWagon = isCafeWagon;
  }
}
