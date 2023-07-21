package part2.ch02.v14;

public interface Calc {
    double PI = 3.14;
    int ERROR = -9999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    //디폴트 메서드
    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        //private같은 경우, 그래서 Calc내에서 함수 사용
        myStaticMethod();
    }

    //정적 메서드
   static int total(int[] arr){
        int total = 0;
        for(int num:arr){
            total += num;
        }
        myStaticMethod();
        return total;
    }

    //private 메서드
    private void myMethod(){
        System.out.println("myMethod");
    }

    //Test에서 재정의를 하지 않음 !!
    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }
}
