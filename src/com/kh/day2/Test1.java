package com.kh.day2;

public class Test1 {
    public static void main(String[] args) {
        if (!true) {
            System.out.println("참");
        }

        // 2의 배수이면서 3의 배수
        int value1 = 10;
        if (value1 % 2 == 0 && value1 % 3 == 0) {
            System.out.println("2의 배수이면서 3의 배수인 수이다");
        } else {
            System.out.println("2의 배수이면서 3의 배수인 수가 아니다");
        }

        // 2의 배수도 아니고 3의 배수도 아닌 조건식
        int value2 = 10;
        if (!(value1 % 2 == 0 && value1 % 3 == 0)) {    // ! : not
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }

        if (value1 % 2 != 0 || value1 % 3 != 0) {       // || : or
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
    }
}


