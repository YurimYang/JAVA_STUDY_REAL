package part2.ch01.v14;

public class Bus {
    int busNum;
    int passCnt;
    int money;

    public Bus(int busNum){
        this.busNum = busNum;
    }

    public void take(int money) {
        this.money += money;
        passCnt++;
    }

    public void showBusInfo(){
        System.out.println(busNum + "번 버스의 승객은 " + passCnt + "명 이고, 수입은 " + money
         + "원 입니다.");
    }
}
