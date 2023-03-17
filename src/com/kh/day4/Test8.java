package com.kh.day4;

import java.util.Scanner;

/*
    가위바위보 게임을 구현하시오
    Math.random() : 0.0 <= 실수값 < 1.0
 */
public class Test8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            int x = (int) (Math.random() * 45 + 1);
            System.out.println(x);
        }

        // "가위"
//        String str = "가위";
//        String str2 = "주먹";
//        if (str.equals(str2)) {
//            System.out.println("같다");
//        } else {
//            System.out.println("다르다");
//        }
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;
        while (!stop) {
            System.out.println("가위, 바위, 보 중에서 하나를 선택하세요. ");
            String a = scanner.nextLine();

            int b = (int) (Math.random() * 3 + 1);


            if (b == 1) {
                System.out.println("컴퓨터: 가위");
            } else if (b == 2) {
                System.out.println("컴퓨터: 바위");
            } else {
                System.out.println("컴퓨터: 보");
            }

            switch (a) {
                case "가위":
                    if (b == 1) {
                        System.out.println("비겼음");
                    } else if (b == 2) {
                        System.out.println("졌음");
                    } else {
                        System.out.println("이겼음");
                    }
                    break;

                case "바위":
                    if (b == 1) {
                        System.out.println("이겼음");
                    } else if (b == 2) {
                        System.out.println("비겼음");
                    } else {
                        System.out.println("졌음");
                    }
                    break;
                case "보":
                    if (b == 1) {
                        System.out.println("졌음");
                    } else if (b == 2) {
                        System.out.println("이겼음");
                    } else {
                        System.out.println("비겼음");
                    }
                    break;
                default:
                    end();
            }
        }
    }


    public static void end() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("종료 하시겠습니까? (Y/N)");
        String answer = scanner.nextLine();

        boolean stop = false;
        if (!answer.equalsIgnoreCase("Y")) {
            stop = true;
        }
    }
}


