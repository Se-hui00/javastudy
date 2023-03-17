package com.kh.day5;

public class Test1 {
    public static void main(String[] args) {

        boolean flag = false;
        for (int i = 0; i < 5 ; i++) {
            if (i % 2 == 0) {
                // continue;   // 실행문을 실행하지 않고 바로 증감식으로 이동
                // break;  // 조건식이 참이 되면 반복문을 빠져나옴
                flag = true;

                if (flag) {
                    continue;
                } else {
                    break;
                }
            }
            System.out.println("i = " + i);
        }
    }
}



