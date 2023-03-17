package com.kh.day12.c;

public class Main2 {
  public static void main(String[] args) {
    Student s1 = new Student();
    Teacher t1 = new Teacher();
    HighStudent hs1 = new HighStudent();

    doEat(s1);
    doEat(t1);
    doEat(hs1);

    Person obj1 = s1;
    Person obj2 = t1;
    Person obj3 = hs1;
    obj1.eat();
    obj2.eat();
    obj3.eat();

    byte x = 10;
    short y = 20;
    int z = 30;
    float a = 40.0f;

    callMethod(x);
    callMethod(y);
    callMethod(z);
    callMethod(a);
  }

  static void doEat(Person obj) {
    obj.eat();
  }

  static void callMethod(double val) {
    System.out.println(val);
  }
}

