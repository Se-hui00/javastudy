package com.kh.day2;

public class Test3 {
    public static void main(String[] args) {
        int day;
        day = 1;
        switch (day) {                          // 정수, 문자, 문자열만 가능
            case 1:
                System.out.println("one");
                break;                          // 빠져나옴
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("etc");
        }
        System.out.println("프로그램 종료");
    }
}


