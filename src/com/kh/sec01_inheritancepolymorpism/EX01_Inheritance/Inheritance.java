package com.kh.sec01_inheritancepolymorpism.EX01_Inheritance;

public class Inheritance {

  public static void main(String[] args) {
    Human h = new Human();
    h.name = "케로로";
    h.age = 18;
    h.eat();
    h.sleep();

    Student s = new Student();
    s.name = "기로로";
    s.age = 12;
    s.studentID = 127;
    s.eat();
    System.out.println("-----");
    Human h2 = (Human)s;
    h2.eat();           // eat, sleep만 가능함
    System.out.println("------");
    s.sleep();
    s.goToSchool();

    Worker w = new Worker();
    w.name = "도로로";
    w.age = 28;
    w.workerID = 128;
    w.eat();
    w.sleep();
    w.goToWork();
  }

}
