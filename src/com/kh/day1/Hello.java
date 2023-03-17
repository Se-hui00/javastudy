package com.kh.day1;

/*
소스파일 : com.kh.day1.Hello.java
by yoon
자바프로그램의 기본 구조
 */
public class Hello {

    // main() 메소드에서 실행 시작
    public static void main(String[] args){
        int i = 20; //정수형 변수 i에 20을 저장
        int s;      //정수형 변수 s 선언
        char a;     //문자형 변수 a 선언

        //s = i + 10; // 산술연산자 : +,-,*(곱셈),/(나누기),%(나머지)
        s = sum(i, 10); //sum 메소드 호출
        a = '?';    //변수 a에 '?' 저장
        System.out.println(a);        //문자 '?' 화면 출력
        System.out.println("com.kh.day1.Hello");  // "com.kh.day1.Hello" 문자열 화면 출력
        System.out.println(s);        // 정수 s값 화면 출력
    }

    //sum 메소드
    public static int sum(int n, int m){
        // return : 1. 메소드 종료 2. 표현식의 결과값 반환
        return n + m;
    }
}

