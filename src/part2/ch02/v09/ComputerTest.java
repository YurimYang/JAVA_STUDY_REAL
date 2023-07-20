package part2.ch02.v09;

public class ComputerTest {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        //Computer의 하위 클래스들이므로, Computer의 메서드를 모두 쓸 수 있음!
        //Computer computer = new Computer();
        //└ 불가능 : Computer 자체가 abstract한 클래스이므로, 생성자 선언 x
    }

}
