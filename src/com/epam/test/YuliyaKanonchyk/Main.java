package com.epam.test.YuliyaKanonchyk;

import com.epam.test.YuliyaKanonchyk.entity.*;

import java.util.List;

public class Main {
  public static void main(String[] args) {
      Train train = new PassengerTrain();

      PassengerWagon wagon1 = new PassengerWagon(PassengerWagon.WagonType.PLATSKART);
      wagon1.fillRandomly();

      train.addWagon(wagon1);

      PassengerWagon wagon2 = new PassengerWagon(PassengerWagon.WagonType.KUPE);
      wagon2.fillRandomly();

      train.addWagon(wagon2);

      PassengerWagon wagon3 = new PassengerWagon(PassengerWagon.WagonType.RESTORAN);
      wagon3.fillRandomly();

      train.addWagon(wagon3);

      System.out.println("Train: ");
      System.out.println(train);

      int luggageNumber = train.getLuggageNumber();
      System.out.println("Luggage:" + luggageNumber);

      int passengersNumber = train.getPassengersNumber();
      System.out.println("Passengers:" +passengersNumber);

      train.sortWagons(Parameter.BY_LUGGAGES);
      List<Wagon> wagons = train.findWagons(Parameter.BY_PASSENGERS, 20, 50);
      System.out.println("Found wagons:");
      for (Wagon wagon : wagons) {
          System.out.println(wagon.toString());

      }
  }

}
