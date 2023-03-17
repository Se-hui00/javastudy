package com.kh.day5;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
    로또 생성 프로그램을 작성하시오
    (1~45) 중 6개의 중복되지 않는 번호추출
 */
public class Test18 {
    public static void main(String[] args) {
        int[] lotto = new int[6];   // 로또 번로를 담을 배열 생성

        int dupCnt = 0;
        int forCnt = 0;
        for (int i = 0; i < lotto.length; i++) {
            int number = 0;
            boolean stop = false;
            while (!stop){
                number = (int)(Math.random()*45) + 1;
                boolean isDup = false;
                    for (int j = 0; j < i; j++) {
                        forCnt++;
                        if (lotto[j] == number) {
                            isDup = true;
                            dupCnt++;
                            break;
                        }
                    }
                if (!isDup) {
                     stop = true;
                }
            lotto[i] = number;
            }
        }

        System.out.println("중복 횟수 = " + dupCnt);
        System.out.println("for문 횟수 = " + forCnt);

        Arrays.sort(lotto); // 오름차순 정렬

        // 이번주 로또번호
        for (int i = 0; i < lotto.length; i++) {
            if (i == lotto.length - 1) {
                System.out.println(lotto[i]);   // 마지막 요소는 ',' 출력 제외
            } else {
                System.out.print(lotto[i]+",");
            }
        }
    }
}


