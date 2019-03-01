package com.epam.test.YuliyaKanonchyk.entity;

import java.util.List;

public interface Train {
    int getPassengersNumber();
    int getLuggageNumber();
    void sortWagons(Parameter... parameters);
    List<Wagon> findWagons(Parameter parameter, int minValue, int maxValue);
    void addWagon (Wagon wagon);
}
