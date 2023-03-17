package com.kh.sec01_selelctcontrolstatment.EX02_switchControlStatement;

public class SwitchControlStatement {
    public static void main(String[] args) {
        // break가 포함되지 않았을 때
        int value1 = 2;
        switch (value1) {
            case 1:
                System.out.println("A");
            case  2:
                System.out.println("B");    // 점프한 후 계속 실행
            case 3:
                System.out.println("C");
            default:
                System.out.println("D");
        }
        System.out.println();


        // break가 포함돼 있을 때
        int value2 = 2;
        switch (value2) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");    // 실핸한 후 탈출
                break;
            case 3:
                System.out.println("C");
            default:
                System.out.println("D");
        }
        System.out.println();

        // if - else if - else 구문으로 변환
        if (value1 == 1) {
            System.out.println("A");
        }
        else if (value1 == 2) {
            System.out.println("B");
        }
        else if (value1 == 3) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}



