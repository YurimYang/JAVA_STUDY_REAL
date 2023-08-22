package part2.ch05.v02;

public class AddTest {
    public static void main(String[] args) {
        Add add = (x,y) -> x+y; //람다식의 구현을 add에 넣음
        System.out.println(add.add(3,4));
    }
}
