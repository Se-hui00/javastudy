package com.kh.day6;

public class Test10 {
    public static void main(String[] args) {
        System.out.println();

        double x = 3.14159;
        int y = 10;
        System.out.printf("원주율 %10.2f 반지름 %d", x,y);  // f : format

        int a =10;
        int b =20;
        int c =30;
        int sum = a+b+c;
        double avg = (double)sum / 3;

        System.out.println("합계 = " + sum);
        System.out.println("평균 = " + avg);

        System.out.printf("합계 = %d, 평균 = %5.2f\n", sum, avg);   // \n : 줄바꿈
        System.out.printf("합계 = %d, 평균 = %5.2f\n", sum, avg);
        System.out.printf("합계 = %d\t 평균 = %5.2f", sum, avg);    // \t : tab 키

        //method1();
    }

    public static int method1(int x, int y) {       // 매개변수가 다르면 메소드 이름이 같을 수 있음
        return x + y;
    }

    public static int method1(int x, int y, int z) {
        return x + y;
    }

    public static int method1(int x, int y, int z, int a) {
        return x + y;
    }
}


