package homework;

// 문제 1
public class Test1 {
    public static void main(String[] args) {
        printStar1();
        printStar2();
    }

    // 문제 1
    public static void printStar1(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // 문제 2
    public static void printStar2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // 문제 3
    public static void printStar3() {
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 4-i ; j++) {
                System.out.println(" ");
            }
            for (int j = 1; j <= (i*2) - 1 ; j++) {
            System.out.println("*");
            }
        }
        System.out.println();
    }

    public static void printStar4() {
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 0; j <= 4 ; j++) {
                System.out.println(" ");
            }
            for (int j = 0; j < 2; j++) {
            System.out.println("*");
            }
        }
    }
}



