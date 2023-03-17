package com.kh.day5;

import java.util.Scanner;

/*
    가위바위보 게임을 구현하시오
    Math.random() : 0.0 <= 실수값 < 1.0
    1 : 가위
    2 : 바위
    3 : 보
 */
public class Test2 {
    public static void main(String[] args) {

        // 컴퓨터
        int random = oneOfThree();
        System.out.println("random = " + random);


        // 사용자
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> 가위바위보 게임 <<");

        boolean stop = false;
        while (!stop) {
            System.out.print("선택 >> ");
            String player =  scanner.nextLine();

            String computer = "";
            String result = "";     // 승, 패, 비김

            switch (random) {
                case 1 :    // com : 가위
                    computer = "가위";
                    switch (player) {
                        case "가위" :
                            result = "비김";
                            break;
                        case "바위" :
                            result = "승";
                            break;
                        case "보" :
                            result = "패";
                            break;
                        default:
                            continue;
                    }
                    break;

                case 2 :
                    computer = "바위";
                    switch (player) {
                        case "가위":
                            result = "패";
                            break;
                        case "바위":
                            result = "비김";
                            break;
                        case "보":
                            result = "승";
                            break;
                        default:
                            continue;
                    }
                    break;

                case 3 :
                    computer = "보";
//                    switch (player) {
//                        case "가위":
//                            result = "승";
//                            break;
//                        case "바위":
//                            result = "패";
//                            break;
//                        case "보":
//                            result = "비김";
//                            break;
//                        default:
//                            continue;
//                    }
                    if (computer.equals("보") && player.equals("가위")) {
                        result = "승";
                    } else if (computer.equals("보") && player.equals("바위")) {
                        result = "패";
                    } else if (computer.equals("보") && player.equals("보")) {
                        result = "비김";
                    } else {
                        continue;
                    }
                    break;
                default:
            }
            System.out.println("computer = " + computer);
            System.out.println("player = " + player );
            System.out.println("result = " + result);

            System.out.print("계속 하시겠습니까? (y/n) ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("N")) {
                stop = true;
            }
        }
    }

    // 1~3까지의 정수를 만들어내는 메소드
    public static int oneOfThree() {
        int result = 0;
        result = (int)(Math.random() * 3) + 1;
        return result;
    }
}





