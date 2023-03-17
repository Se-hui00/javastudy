package com.kh.day2;
/*
 * 국, 영, 수의 총점과 평균을 구하시오.
 */
public class Test6 {
    public static void main(String[] args) {
        method1();
        printLine('*', 30);
        method2();
        printLine('*', 30);
        method3();
        printLine('*', 30);
        method4();
        printLine('*', 30);
    }

    public static void printLine(char c, int cnt) {
        for (int i = 0; i < cnt; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void method1() {
        int kor = 90;
        int eng = 85;
        int math = 70;

        System.out.println("총점: " + (kor + eng + math));
        System.out.println("평균: " + ((double)(kor + eng + math) / 3));
    }
    public static void method2() {
        int kor = 90;
        int eng = 85;
        int math = 70;

        int sum = kor + eng + math;
        double avg = (double) sum / 3;

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }

    public static void method3() {
        int kor, eng, math, sum;
        double avg;

        kor = 90;
        eng = 85;
        math = 70;

        sum = kor + eng + math;
        avg = (double) sum / 3;

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }

    public static void method4() {
        int kor, eng, math, sum;
        double avg;

        kor = 90;
        eng = 85;
        math = 70;

        sum = sum(kor, eng, math);
        avg = avg(sum, 3);
        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }

    // 3개의 정수값을 입력받아 합계를 반환하는 메소드
    public static int sum(int val1, int val2, int val3) {
        int result = 0;
        result = val1 + val2 + val3;
        return result;
    }
    //2개의 정수(나누어지는 값과 나눌값)을 입력받아 계산결과를 반환하는 메소드
    public static double avg(int val1, int val2) {
        double result = 0.0;
        result = (double) val1 / val2;
        return result;
    }
}

