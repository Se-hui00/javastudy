package com.kh.day14.a;

public interface SmartPower extends Power, Voltage {
  default void smartOn(){
    System.out.println("스마트 충전 on");
  };

  // 재정의 못함 static
  static void smartOff(){
    System.out.println("스마트 전원 off");
  };
}
