package com.kh.day13.ex11;

import java.util.Objects;

public class A {
  int data;

  A(int data) {
    this.data = data;
  }

//  @Override
//  public boolean equals(Object obj) { // 선언부 수정 불가
//    boolean flag = false;
//    if (obj == null){
//      return flag;
//    }
//
//    A a = (A)obj;
//    if (this.data == a.data) {
//      flag = true;
//    }
//    return flag;
//  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    A a = (A) o;
    return data == a.data;
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }
}





