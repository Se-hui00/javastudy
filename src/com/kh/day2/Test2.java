package com.kh.day2;

public class Test2 {
    public static void main(String[] args) {
        int value1 = 10;

        // 값
        if (true) {
            System.out.println("참");
        } else{
            System.out.println("거짓");
        }

        // value1이 2의 배수인지 체크
        // 식
        if (value1 % 2 == 0) {
            System.out.println(value1 + "는 짝수다");   // 문자열 연결연산자
        } else {
            System.out.println(value1 + "는 홀수다");
        }

        System.out.println();

        // 메소드 호출
        if (isTwise(value1)) {
            System.out.println(value1 + "는 짝수다");
        } else {
            System.out.println(value1 + "는 홀수다");
        }

        // 변수 사용
        boolean flag = isTwise(value1);
        if (flag) {
            System.out.println(value1 + "는 짝수다");
        } else {
            System.out.println(value1 + "는 홀수다");
        }
    }

    // 짝수인지 판단하는 메소드
    public static boolean isTwise(int value) {
        boolean flag = false;   // 지역변수는 초기값이 필요함
        if (value % 2 == 0) {
            flag = true;
        }
        return flag;
    }
}






