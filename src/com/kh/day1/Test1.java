package com.kh.day1;

public class Test1 {
    public static void main(String[] args) {
        int i;      // 정수 변수 i 선언
        i = 10;     // 정수 변수 i에 값을 대입(할당)
        System.out.println(i);

        int j;      // 정수 변수 j 선언
        j = 20;     // 정수 변수 j에 정수값을 할당 (초기화)
        System.out.println(j);

        j = 30;     // 정수 변수 j에 정수값을 재할당
        System.out.println(j);

        boolean flag;   // 논리형 변수 flag 선언
        flag = true;    // true or false만 가능
        System.out.println(flag);

        double k;      // 실수형 변수 k선언 (8byte)
        k = 3.14;      // 실수형 변수 k에 값을 할당
        System.out.println(k);

        k = 5.14;
        System.out.println(k);

        final double PI;     // 상수인 실수형 변수 PI을 선언
        PI = 3.14;           //초기화 ( 상수 변수는 재할당 불가)

    }
}


