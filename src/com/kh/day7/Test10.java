package com.kh.day7;
// 내가 해서 망함
import java.util.Scanner;

//  영화관 좌석 예매 시스템 구현하기
public class Test10 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("좌석을 선택하세요 (1~60), 0:종료");
    System.out.print("> ");
    double value1 = Integer.parseInt(scanner.nextLine());

    double plus;
    double[][] movie = new double[6][10];
    plus = 0;

    for (int i = 0; i < movie.length; i++) {
      for (int j = 0; j < movie[i].length; j++) {
          plus = plus + 1;
          movie[i][j] = plus;
        System.out.print((int)movie[i][j] + "\t");
      }
      System.out.println();
    }

    if (value1 != 'x') {
    }
  }
}
