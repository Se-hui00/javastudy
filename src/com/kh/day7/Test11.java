package com.kh.day7;

public class Test11 {
  public static void main(String[] args) {

    String [][] seats = new String[6][10];

    int seatNum = 0;
    for (int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[i].length; j++) {
        seats[i][j] = ++seatNum + "";
      }
    }

    // 좌석 출력
    for (int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[i].length; j++) {
        System.out.printf("%3s",seats[i][j]);
      }
      System.out.println();
    }

    int seat = 35;
    int row = (seat-1) / 10;
    int column = (seat-1) % 10;
    seats[row][column] = "x";

    // 좌석 출력
    for (int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[i].length; j++) {
        System.out.printf("%3s",seats[i][j]);
      }
      System.out.println();
    }
  }
}


