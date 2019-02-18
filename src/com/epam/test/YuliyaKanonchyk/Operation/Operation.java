package com.epam.test.YuliyaKanonchyk.Operation;

import com.epam.test.YuliyaKanonchyk.entity.PassengerWagon;

import java.util.Set;

public interface Operation {
    Set<PassengerWagon> execute(Set<PassengerWagon> passWagon);
}
