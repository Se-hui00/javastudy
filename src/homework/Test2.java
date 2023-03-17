package homework;

import java.util.Arrays;

// 로또 번호 생성하기

public class Test2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        int dupCnt = 0;
        for (int i = 0; i < lotto.length; i++) {
            int number = 0;
            boolean stop = false;
            while (!stop){
                number = (int)(Math.random()*45) + 1;
                boolean isDup = false;
                for (int j = 0; j < i; j++) {
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

        Arrays.sort(lotto);

        for (int i = 0; i < lotto.length; i++) {
            if (i == lotto.length - 1) {
                System.out.println(lotto[i]);
            } else {
                System.out.print(lotto[i]+",");
            }
        }
    }
}

