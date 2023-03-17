package com.kh.day4;
/*
    1 ~ 10까지의 합을 구하시오(for, while, do~while)
 */
public class Test3 {
    public static void main(String[] args) {
        doFor();
        doWhile();
        doDOWhile();
    }

    private static void doDOWhile() {
        int sum = 0;
        int i = 1;
        do {
            sum = sum + i;
            i++;
        }while (i <= 10);
        System.out.println("1부터 10까지의 합: " + sum);
    }

    private static void doFor() {
        int sum = 0;
        int i = 1;
            for (; i <= 10 ;) {
                sum = sum + i;
                i++;
            }
            System.out.println("1부터 10까지의 합: " + sum);
        }

    private static void doWhile() {
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("1부터 10까지의 합: " + sum);
    }
}



