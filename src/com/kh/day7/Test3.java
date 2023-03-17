package com.kh.day7;
// 그려보면서 공부하기
public class Test3 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];  // 배열 선언, 생성, 초기화

        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[1].length);
        System.out.println(array[2].length);

        // 일반 for문
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        System.out.println("----------");

        // 향상된 for문 이용
        for (int[] row : array) {
            for (int column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}












