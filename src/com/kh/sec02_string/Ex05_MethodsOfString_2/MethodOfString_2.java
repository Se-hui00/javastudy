package com.kh.sec02_string.Ex05_MethodsOfString_2;

import java.util.Arrays;

public class MethodOfString_2 {
  public static void main(String[] args) {
    // 문자열 수정
    // @toLowerCase(), toUpperCase()
    String str1 = "Java Study";
    System.out.println(str1.toLowerCase());
    System.out.println(str1.toUpperCase());

    // @replace()
    System.out.println(str1.replace("Study","공부")); //"Study" 문자열을 "공부"로 변경

    // @substring()
    System.out.println(str1.substring(0,5));  // 0~4의 문자열

    // @split()
    String[] strArray = "abc/def-ghi jkl".split("/|-| "); // '/' 또는 '-' 또는 ' '(공백)으로 구분된 문자열 배열 반환
    System.out.println(Arrays.toString(strArray));              // | or의 의미로 사용됨

    // @trim()
    System.out.println("  abc   ".trim());

    System.out.println();

    // 문자열의 내용 비교
    String str2 = new String("Java"); // new로 생성해 메모리에 별도의 객체로 생성
    String str3 = new String("Java");
    String str4 = new String("java");

    // @stack 메모리 비교(==): 위치(번지) 비교
    System.out.println(str2 == str3);
    System.out.println(str3 == str4);
    System.out.println(str4 == str2);
    System.out.println(System.identityHashCode(str2));  // 주소값이 다름
    System.out.println(System.identityHashCode(str3));
    System.out.println(System.identityHashCode(str4));

    // @equals(), equalsIgnoreCase(): 내용 비교
    System.out.println(str2.equals(str3));
    System.out.println(str3.equals(str4));
    System.out.println(str3.equalsIgnoreCase(str4));

    String str5 = "JAVA";
    String str6 = "JAVA";
    String str7 = "JAVA";
    System.out.println(System.identityHashCode(str5));  // 주소값이 같음
    System.out.println(System.identityHashCode(str6));
    System.out.println(System.identityHashCode(str7));
  }
}
