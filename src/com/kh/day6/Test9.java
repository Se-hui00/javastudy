package com.kh.day6;
// 숫자로된 문자열 =>  숫자
// 숫자 => 숫자로된 문자열
public class Test9 {
    public static void main(String[] args) {
        int x = Integer.parseInt("10");

        double y = Double.parseDouble("3.14");

        boolean flag = Boolean.parseBoolean("true");

        int a = 10;
        String b = String.valueOf(a);   // "10"

        double c = 3.14;
        String d = String.valueOf(c);   // "3.14"

        boolean e = true;
        String f = String.valueOf(e);      // "true"
    }
}


