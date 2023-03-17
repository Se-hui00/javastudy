package com.kh.day6;
// 인덱스를 구할 수 있는 표현식이 올 수 있음
public class Test13 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};

        // 첫번째 요소 (1행 1열)
        System.out.println(array[0]);

        // 마지막 요소
        System.out.println(array[array.length-1]);

        // 마지막에서 두번째 요소
        System.out.println(array[array.length-2]);

    }
}



