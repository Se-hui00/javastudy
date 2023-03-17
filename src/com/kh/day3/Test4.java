package com.kh.day3;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<< 3개의 정수값을 입력받아 최대값 구하기 >>");

        boolean stop = false;

        while (!stop) {
        System.out.print("> 정수1 : ");
        int x = Integer.parseInt(scanner.nextLine());   // 사용자에게 값을 받고 대입
        System.out.print("> 정수2 : ");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.print("> 정수1 : ");
        int z = Integer.parseInt(scanner.nextLine());

        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        System.out.println("최대값 : " + max);
        System.out.print("계속하시겠습니까? (Y/N)");
        String answer = scanner.nextLine();
            //if (!answer.equals("Y") || !answer.equals("y")) {
            if (!answer.equalsIgnoreCase("Y")) {    // 대소문자 상관없이
                stop = true;    // break가 없어도 멈춰짐
            }
        }
    }
}

