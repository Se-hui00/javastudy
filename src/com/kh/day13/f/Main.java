package com.kh.day13.f;

public class Main {
  public static void main(String[] args) {
    System.out.println(Soundable.X);

    Cat c1 = new Cat();
    c1.sound();

    Soundable c2 = new Cat();
    c2.sound();

    Soundable c3 = new Radio();
    c3.sound();

    Soundable c4 = new Mp3Player();
    c4.sound();

    Mp3Player c5 = (Mp3Player) c4;
    c5.sound();
    c5.playMp3();
  }
}
