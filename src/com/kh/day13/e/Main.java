package com.kh.day13.e;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Student();
    p1.eat();
    p1.smile();

    Student s1 = (Student) p1;  // 강제형변환
    s1.eat();
    s1.smile();

    Student s2 = new Student();
    s2.eat();
    s2.smile();

    // 익명 이너 클래스 (1회성 인스턴스)
    Person p2 = new Person(){
      @Override
      public void eat() {
        System.out.println("먹다");
        study();
      }

      public void study() {
        System.out.println("공부하다");
      }
    };

    p2.eat();
    p2.smile();
//    p2.study(); // Person의 관점, 다운캐스팅이 안됨


    Person p3 = new Person() {
      @Override
      public void eat() {
        System.out.println("먹다");
        teach();  // 내부적으로만 사용 가능
      }

      void teach() {
        System.out.println("가르치다");
      }
    };
    p3.eat();

    // new Person() alt + ent // 블럭 잡고 ctrl + alt + v
    Person p4 = new Person() {
      @Override
      public void eat() {
        System.out.println("웃다^^");
      }
    };
    p4.eat();
    p4.smile();
  }
}
