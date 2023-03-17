package com.kh.day5;

public class Test6 {
    public static void main(String[] args) {
    String result1 = (5 > 3) ? "크다" : "크지 않다";
        System.out.println(result1);

        int x = 3;
        String result2 = (x > 3) ? "크다" : ((x == 3) ? "같다" : "작다");
        System.out.println(result2);
    }
}


