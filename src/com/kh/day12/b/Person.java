package com.kh.day12.b;

public class Person {
  private String name;
  private int age;
  private String national;

  // 인스턴스 초기화 블럭
  {
    String[] national = {"한국인", "일본인", "중국인"};
    this.national = national[(int)(Math.random()*3)];
    System.out.println("인스턴스 초기화 블럭 호출됨!");
  }

  public Person() {
    super();
  }

  public Person(String name) {
    super();  // 제일 위에 위치해야함
    this.name = name;
    System.out.println("public Person(String name) called!");
  }

  public Person(int age) {
    super();
    this.age = age;
    System.out.println("public Person(int age) called!");
  }

  public Person(String name, int age) {
//    super();  // 부를 수 없음 // this와 같음
    this(name); // 자기 자신의 생성자를 부를 때는 하나만 가능, 맨 위에 있어야함
    this.age = age;
    System.out.println("public Person(String name, int age) called!");
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", national='" + national + '\'' +
            '}';
  }
}










