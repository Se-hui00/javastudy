package com.kh.day7;

public class Test1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // float result = sum(x,y);    // 형 변환 가능
        short result = (byte)sum(x,y);
    }

    public static int sum(double x, double y) {
        int result = 0;
        result = (int)(x + y);  // 강제 형변환: 작은 타입 <- (타입)큰 타입
        return result;
    }

    public static void method1() {
        sum(5,7);        // 메인메소드가 아니라도 호출가능
    }
}



