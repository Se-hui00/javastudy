package com.kh.day7;

public class Test2 {
    public static void main(String[] args) {

        double[] result = new double[3];
        result[0] = calculate('+',2,3);
        result[1] = calculate('-',2,3,4);
        result[2] = calculate('*',2,3,4,5);

        for (double ele : result) {
            System.out.printf("%4.2f\n",ele);
        }
    }

    public static double calculate(char operator, double...value) { // 가변 변수는 마지막에 위치
     double result = 0.0;

        for (double ele: value) {
            switch (operator) {
                case '+':
                    result += ele;  // result = result + ele;   // 처리 속도 빨라짐
                    break;
                case '-':
                    result -= ele;
                    break;
                case '*':
                    result *= ele;
                    break;
                case '/':
                    result /= ele;
                    break;
            }
        }
     return  result;
    }
}



