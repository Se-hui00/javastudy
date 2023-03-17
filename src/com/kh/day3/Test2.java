package com.kh.day3;
/*
    3개의 정수값을 비교하여 최대값을 구하는 프로그램을 작성하시오.
 */
public class Test2 {
    public static void main(String[] args) {
        int x = 7;
        int y = 12;
        int z = 10;
        int a = 17;

        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        if (a > max) {
            max = a;
        }
        System.out.println("최대값: " + max);


        if (x > y && x > z) {       // && : and
            System.out.println("최대값: " + x );
        } else if (y > x && y > z) {
            System.out.println("최대값: " + y);
        } else {
            System.out.println("최대값: " + z);
        }
    }
}





