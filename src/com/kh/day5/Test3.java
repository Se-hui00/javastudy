package com.kh.day5;

public class Test3 {
    public static void main(String[] args) {

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 1;
        int sum4 = 1;

        for (int i = 1; i <= 10 ; i++) {
            // 대입연산자
            sum1 += i; // sum1 = sum1 + i;
            sum2 -= i; // sum2 = sum2 - i;
            sum3 *= i; // sum3 = sum3 * i;
            sum4 /= i; // sum4 = sum4 / i;
        }
        System.out.println("sum = " + sum1);
        System.out.println("sum = " + sum2);
        System.out.println("sum = " + sum3);
        System.out.println("sum = " + sum4);
    }
}



