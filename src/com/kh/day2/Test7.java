package com.kh.day2;
//        for (초기화식; 조건식; 증감식;){
//            실행문1;
//            실행문2;
//        }

public class Test7 {
    public static void main(String[] args) {
        for (; true; ) {                        // 무한반복
            System.out.println("*");
        }
    }

    public static void method3() {
        int sum = 0;
        int i = 1;
        for (; i <= 3; ) {
            sum = sum + i;
            i++;
        }
        System.out.println("i: " + i);
        System.out.println("합계: " + sum);
    }

    public static void method2() {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum = sum + i;
        }
    }

    public static void method1() {
        int i = 1;
        int j = 2;
        int k = 3;
        int sum = i + j + k;
        System.out.println("1~3까지의 합: " + sum);
    }
}


