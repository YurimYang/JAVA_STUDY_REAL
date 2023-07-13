package part2.ch01.v14;

public class Subway {
    int subwayNum;
    int passCnt;
    int money;

    public Subway(int busNum){
        this.subwayNum = busNum;
    }

    public void take(int money) {
        this.money += money;
        passCnt++;
    }

    public void showSubwayInfo(){
        System.out.println(subwayNum + "번 지하철의 승객은 " + passCnt + "명 이고, 수입은 " + money
                + "원 입니다.");
    }
}
