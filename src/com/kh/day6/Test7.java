package com.kh.day6;

public class Test7 {
    public static void main(String[] args) {
        String[][][] trainee = new String[2][4][];

        trainee[0] = new String[4][];
        trainee[0][0] = new String[]{"윤태영", "김민섭"};
        trainee[0][1] = new String[]{"박정효", "유창혁", "이종형", "최민식"};
        trainee[0][2] = new String[]{"이관희", "박청경", "신세희", "이수민"};
        trainee[0][3] = new String[]{"최민승", "이준홍", "황세호"};


        trainee[1] = new String[4][];
        trainee[1][0] = new String[]{"오효정", "최은아", "윤난경"};
        trainee[1][1] = new String[]{"김진호", "정훈", "유원진", "김영훈"};
        trainee[1][2] = new String[]{"이민기", "박경진", "박윤주"};
        trainee[1][3] = new String[]{"함현식", "황성욱", "박제창", "김규서"};
        
        for (int i = 0; i < trainee.length; i++) {
            for (int j = 0; j < trainee[i].length; j++) {
                for (int k = 0; k < trainee[i][j].length; k++) {
                    if (k == trainee[i][j].length-1){
                        System.out.println(trainee[i][j][k]);
                    }else{
                        System.out.print(trainee[i][j][k]+",");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        int i = (int)(Math.random() * trainee.length);
        int j = (int)(Math.random() * trainee[i].length);
        int k = (int)(Math.random() * trainee[i][j].length);

        System.out.println("반장 = " + trainee[i][j][k]);
    }
}


