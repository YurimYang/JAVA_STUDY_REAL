package part2.ch05.v03;

public class MyNumberTest {
    public static void main(String[] args) {
        /** 방법1
        MyNumber myNumber = (x,y) ->{
            if(x>y) {
                return x;
            } else {
                return y;
            }
        };
         **/

        // 방법2
        MyNumber myNumber = (x,y) -> x>y?x:y;
        System.out.println(myNumber.getMax(10,20));
    }
}
