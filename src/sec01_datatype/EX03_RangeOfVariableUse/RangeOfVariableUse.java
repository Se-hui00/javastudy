package sec01_datatype.EX03_RangeOfVariableUse;

public class RangeOfVariableUse {
    public static void main(String[] args) {
        int value1 = 3; // 지역변수의 생명주기 : 변수가 선언된 블럭내에서 유효하다.
        {
            // int value1;   //상위블럭에 선언된 변수는 하위 블럭에서 동일한 이름으로 선언 불가
            int value2 = 5;
            System.out.println(value1);     // 상위블럭에서 선언된 변수는 하위블럭에서 접근 가능
            System.out.println(value2);
        }

        System.out.println(value1);
        //System.out.println(value2);   // 하위블럭에서 선언된 변수는 상위블럭에서 접근 불가
        method2('*',1);
        method2('*',2);
        method2('*',3);
        method2('*',4);
        method2('*',5);
    }

    public static void method1(){
        int value1 = 10;    //이름은 같지만 다른 변수임
        System.out.println(value1);
    }

    public static void method2(char c, int cnt) {
//        System.out.print(c);
//        System.out.print(cnt);

        for(int i=1; i<=cnt; i++){
            System.out.print(c);
        }
        System.out.println();   // 줄 바꿈
    }
}

