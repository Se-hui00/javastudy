package com.kh.day3;

import java.util.Scanner;
import java.util.concurrent.Callable;

/*
    2개의 정수를 입력받아 사칙연산을 수횅하는 프로그램을 작성하시오.
    1. 사칙연산 선택
    2. 2개의 정수를 입력받아 사칙연산 수행
    3. 계속 여부에 따라 프로그램 유지 또는 종료될 수 있다.
 */
public class Test6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.println(">> 사칙연산 프로그램 <<");
            System.out.println("메뉴 : 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료 ");
            int menu = Integer.parseInt(scanner.nextLine());

            if (menu == 5) {
                System.out.println("프로그램 종료!");
                break;
            }

            System.out.println("첫번째 정수를 입력해주세요.");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("두번째 정수를 입력해주세요.");
            int y = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1:
                    System.out.println(x + " + " + y + " = " + (x + y));
                    break;
                case 2:
                    System.out.println(x + " - " + y + " = " + (x - y));
                    break;
                case 3:
                    System.out.println(x + " x " + y + " = " + (x * y));
                    break;
                case 4:
                    System.out.println(x + " % " + y + " = " + (x / y));
                    break;
                default:
                    System.out.println("메뉴를 선택해주세요");
            }
        }
    }
}










