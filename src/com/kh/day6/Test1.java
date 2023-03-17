package com.kh.day6;
/*
    배열 요소의 초기값은 타입의 기본값으로 초기화된다.
    int : 0;    byte : 0;   short : 0;
    double : 0.0;
    boolean : false;
    char : ' ';
    long : 0L;
    float : o.of;
    String : null;
 */
public class Test1 {
    public static void main(String[] args) {
        int[] subject;          // 배열 선언 // int [] : 참조타입
        subject = new int[3];    // 배열 생성, 배열요소 값 초기화

        // 배열 요소 재할당
        subject[0] = 10;
        subject[1] = 20;
        subject[2] = 30;

        // 배열 요소 접근
        int sum = subject[0] + subject[1];

        for (int i = 0; i < subject.length; i++) {
            System.out.println(subject[i]);         // 배열요소 값 출력
        }
        System.out.println("sum = " + sum);         // subject[0] + subject[1] 갑스 출력
    }
}


