package com.epam.test.YuliyaKanonchyk;

import com.epam.test.YuliyaKanonchyk.entity.Locomotive;
import com.epam.test.YuliyaKanonchyk.entity.Transport;

public class Main {
  public static void main(String[] args) {
    Transport loco = new Locomotive();
    ((Locomotive) loco).preStartCheck();

  }

}
