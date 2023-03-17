package com.kh.day2;
/*
 * 국, 영, 수의 총점과 평균을 구하시오.
 */
public class Test5 {
    public static void main(String[] args) {
        int k = 80;
        int e = 70;
        int m = 90;

        System.out.println("국어: " + k);
        System.out.println("영어: " + e);
        System.out.println("수학: " + m);
        System.out.println("총점: " + sum(k, e, m));
        System.out.println("평균: " + average(sum(k,e,m)));
    }
    public static int sum(int k, int e, int m) {
        return k + e + m;
    }

    public static int average(int sum) {
        int result = 0;
        result = sum / 3;
        return result;
    }
}

