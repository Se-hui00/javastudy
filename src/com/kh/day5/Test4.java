package com.kh.day5;

public class Test4 {
    public static void main(String[] args) {
        method1();
        System.out.println("------------");
        method2();
        System.out.println("------------");
        method3();
    }

    public static void method1() {
        // 선위 증감 연산자
        int i = 10;     // i = 11
        int y = ++i;    // y = 11

        System.out.println("i = " + i);
        System.out.println("y = " + y);
    }
    public static void method2() {
        // 후위 증감 연산자
        int i = 10;     // i = 11
        int y = i++;    // y = 10

        System.out.println("i = " + i);
        System.out.println("y = " + y);
    }
    public static void method3() {
        int i = 10;
        i++;    // i = i + 1;

        int y = 10;
        ++y;    // y = y + 1;
        System.out.println("i = " + i);
        System.out.println("y = " + y);
    }
}


