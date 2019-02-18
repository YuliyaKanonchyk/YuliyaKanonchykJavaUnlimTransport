package com.epam.test.YuliyaKanonchyk.Operation;

import com.epam.test.YuliyaKanonchyk.entity.Locomotive;
import com.epam.test.YuliyaKanonchyk.entity.PassengerWagon;
import com.epam.test.YuliyaKanonchyk.entity.Transport;
import java.util.Set;

public class WagonFill<wagonEnum> implements Operation{
    Transport locomotiv = new Locomotive();

    @Override
    public Set<PassengerWagon> execute(Set<PassengerWagon> passWagon) {
        return null;
    }
}
