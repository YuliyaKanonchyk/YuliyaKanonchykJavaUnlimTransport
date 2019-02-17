package com.epam.test.YuliyaKanonchyk.entity;

import java.util.Random;

public class Locomotive extends PassengerTrain implements Transport {

  Random random=new Random();
  int a=random.nextInt(10);
  @Override
  public boolean preStartCheck() {
    if (a>3){System.out.println("The pre-launch test was successful.");
      startEngine();
      return true;}else {System.out.println("The pre-launch failed.");
      return false;}
  }

  @Override
  public void startEngine() {
    System.out.println("The engine was started.");
    ride();
  }

  @Override
  public void ride(){
    System.out.println("Riding.");
  }
}
