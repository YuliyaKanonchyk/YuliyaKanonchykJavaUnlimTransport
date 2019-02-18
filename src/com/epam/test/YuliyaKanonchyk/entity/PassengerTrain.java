package com.epam.test.YuliyaKanonchyk.entity;

import java.util.*;

public class PassengerTrain implements Train{
    List<Wagon> wagons = new ArrayList<>();

    public PassengerTrain() {
    }

    @Override
    public int getPassengersNumber() {

        int resultPass = 0;
        for (Wagon wagon : wagons) {
            resultPass+= wagon.getPassengers();
        }
        return resultPass;
    }

    @Override
    public int getLuggageNumber() {
        int resultLugg = 0;
        for (Wagon wagon : wagons) {
            resultLugg+= wagon.getLuggeges();
        }
        return resultLugg;
    }

    @Override
    public void sortWagons(Parameter... parameters) {
        Collections.sort(wagons, new Comparator<Wagon>() {
            @Override
            public int compare(Wagon o1, Wagon o2) {
                for (Parameter parameter : parameters) {
                    switch (parameter){
                        case BY_LUGGAGES:
                            return Integer.compare(o1.getLuggeges(), o2.getLuggeges());
                        case BY_PASSENGERS:
                            return Integer.compare(o1.getPassengers(), o2.getPassengers());
                    }

                }
                return 0;
            }
        });
    }

    @Override
    public List<Wagon> findWagons(Parameter parameter, int minValue, int maxValue) {
        List<Wagon> result = new ArrayList<>();
        for (Wagon wagon : wagons) {
          switch (parameter){
              case BY_PASSENGERS:
                  if (wagon.getPassengers()>= minValue && wagon.getPassengers()<= maxValue){
                      result.add(wagon);
                  }
                  break;
              case BY_LUGGAGES:
                  if (wagon.getLuggeges()>= minValue && wagon.getLuggeges()<= maxValue){
                      result.add(wagon);
                  }
                  break;
          }
        }
        return result;
    }

    @Override
    public void addWagon(Wagon wagon) {
        wagons.add(wagon);
    }

    @Override
    public String toString() {
        return "PassengerTrain{" +
                "wagons=" + wagons +
                '}';
    }
}






