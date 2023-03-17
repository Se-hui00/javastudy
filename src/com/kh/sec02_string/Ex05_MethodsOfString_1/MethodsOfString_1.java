package com.kh.sec02_string.Ex05_MethodsOfString_1;
/*
  length(): 문자열의 길이를 리턴한다
  charAt(): 문자열에서 특정 인덱스에 위치해 있는 문자를 알아낸다
  indexOf(): 문자열에서 특정 문자나 특정 문자열을 앞에서부터 찾아 위칫값을 알아낸다
  lastIndexOf(): 문자열에서 특정 문자나 특정 문자열을 뒤에서부터 찾아 위칫값을 알아낸다
 */
import java.util.Arrays;

public class MethodsOfString_1 {
  public static void main(String[] args) {

    // 문자열 길이
    String str1 = "Hello java!";
    String str2 = "안녕하세요! 반갑습니다.";
    System.out.println(str1.length());  // 한글, 영문 구분 없이 한 문자당 1개의 크기를 가짐
    System.out.println(str2.length());
    System.out.println();

    // 문자열 검색
    // @charAt
    System.out.println(str1.charAt(1)); // 한글, 영문 구분 없이 인덱스 1위치의 문자
    System.out.println(str2.charAt(1));
    System.out.println();

    // @indexOf(), lastIndexOf()
    System.out.println(str1.indexOf('a'));  // 앞에서부터 첫 번째 'a'가 위치한 인덱스
    System.out.println(str1.lastIndexOf('a'));  // 뒤에서부터 첫 번째 'a'가 위치한 인덱스
    System.out.println(str1.indexOf('a', 8));
    System.out.println(str1.lastIndexOf('a', 8));
    System.out.println(str1.indexOf("java"));
    System.out.println(str1.lastIndexOf("java"));
    System.out.println(str2.indexOf("하세요"));
    System.out.println(str2.lastIndexOf("하세요"));
    System.out.println(str1.indexOf("bye"));  // 해당 문자(열)이 없는 경우 -1 리턴
    System.out.println(str2.indexOf("고맙습니다"));
    System.out.println();

    // 문자열 변환 및 연결
    // @String.valueOf(기본 자료형): 기본 자료형 -> 문자열 변환
    String str3 = String.valueOf(2.3);
    String str4 = String.valueOf(false);
    System.out.println(str3);
    System.out.println(str4);

    // @concat() 문자열 연결
    String str5 = str3.concat(str4);
    System.out.println(str5);

    // String.valueOf() + concat()
    String str6 = "안녕" + 3;
    String str7 = "안녕".concat(String.valueOf(3));

    // 문자열을 byte[] 또는 char[]로 변환
    String str8 = "Hello java!";
    String str9 = "안녕하세요";

    // @getBytes() : 문자열 -> byte[] 변환
    byte[] array1 = str8.getBytes();
    byte[] array2 = str9.getBytes();
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));

    // @toCharArray() : 문자열 -> char[] 변환
    char[] array3 = str8.toCharArray();
    char[] array4 = str9.toCharArray();
    System.out.println(Arrays.toString(array3));
    System.out.println(Arrays.toString(array4));
  }
}
