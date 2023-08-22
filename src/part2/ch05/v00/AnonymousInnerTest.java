package part2.ch05.v00;

class Outer2{

    int outNum = 100;
    static int sNum = 200;

    //클래스를 스레드화 하는 함수
    Runnable getRunnable(int i){
        int num = 10; //getRunnable이 호출되고 끝이나면 stack에 num이 생겼던게 없어짐
        /** 기본 형태
        class MyRunnable implements Runnable{

            int localNum = 1000;

            //로컬 이너 클래스
            //단, run이란 메서드는 또 호출될 수 있음
            // i랑 num이 없을 수도 있으므로 stack에 잡히면 안됨 ! => final로 처리하기
            @Override
            public void run() {
                System.out.println("i =" + i);
                System.out.println("num = " +num);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
            }

            }
        return new MyRunnable();
        } **/

        //Anonymous 형태 - 바로 return해버리는 형태태
       return new Runnable() {
            int localNum = 1000;

            //로컬 이너 클래스
            //단, run이란 메서드는 또 호출될 수 있음
            // i랑 num이 없을 수도 있으므로 stack에 잡히면 안됨 ! => final로 처리하기
            @Override
            public void run() {
                System.out.println("i =" + i);
                System.out.println("num = " +num);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
            }
        };

    }



    public class AnonymousInnerTest {
        public static void main(String[] args) {
            Outer2 out = new Outer2();
            Runnable runner = out.getRunnable(100);

            runner.run();
        }
    }
}
