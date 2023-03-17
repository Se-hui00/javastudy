package com.kh.day12.e;

public class Main {
  public static void main(String[] args) {
    Student student = new Student();
//    student.name = "탄지로";
    System.out.println(student.name);
    student.eat();


    System.out.println(((Person)student).name); // 재정의가 안됨
    ((Person)student).eat();  // 메소드 안에서 재정의가 되어있음
    // 관점이 바뀌어도 필드는 바뀌지 않음

    System.out.println(Student.age);
    System.out.println(Person.age);

    System.out.println(student.age);
    System.out.println(((Person)student).age);
  }
}


