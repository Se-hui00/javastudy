package com.kh.day12.d;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();

    Phone samsungPhone = new SamsungPhone();
    Phone lgPhone = new LgPhone();
    Phone applePhone = new ApplePhone();

    person.setPhone(samsungPhone);
    person.getPhone().speak();

//    person.phone = lgPhone;
//    person.phone.speak();
    person.setPhone(lgPhone);
    person.getPhone().speak();

//    person.phone = applePhone;
//    person.phone.speak();
    person.setPhone(applePhone);
    person.getPhone().speak();
  }
}

