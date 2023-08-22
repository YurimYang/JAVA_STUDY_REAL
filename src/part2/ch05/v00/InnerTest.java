package part2.ch05.v00;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass(); //내부 클래스 생성
    }

    class InClass{
        int iNum = 100;

        static int sInNum = 500;

        void inTest(){
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스변수");
            System.out.println("OutClass num = " + sNum + "(외부 클래스의 인스턴스변수");
            System.out.println("OutClass num = " + iNum + "(외부 클래스의 인스턴스변수");
        }
        static void sTest(){

        }
    }

    public void usingClass(){
        inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호추라기
    }

    static class InStaticClass{
        int iNum = 100;
        static int sIntNum = 200;

        void inTest(){
            System.out.println("OutClass num = " + iNum + "(내부 클래스의 인스턴스변수");
            System.out.println("OutClass num = " + sNum + "(외부 클래스의 인스턴스변수");
            System.out.println("OutClass num = " + sIntNum + "(내부 클래스의 스테틱변수");
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();
        System.out.println(1);

        OutClass.InClass inClass = outClass.new InClass(); //외부 클래스를 이용하여 내부 클래스 생성
        inClass.inTest();


        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

    }
}
