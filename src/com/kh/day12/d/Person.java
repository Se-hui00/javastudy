package com.kh.day12.d;

public class Person {

  private String name;
  private int age;
  private Phone phone;

  public void setPhone(Phone phone) {
    this.phone = phone;
  }

  public Phone getPhone() {
    return phone;
  }

  public void call(Phone[] phones) {  // 일시적
    for (int i = 0; i < phones.length; i++) {
      phones[i].speak();
    }
  }
}
