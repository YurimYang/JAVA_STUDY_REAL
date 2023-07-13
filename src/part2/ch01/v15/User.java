package part2.ch01.v15;

public class User {
    String userName;
    int money;

    public User(String userName, int money){
        this.userName = userName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        taxi.takeTaxi(10000);
        this.money -= taxi.price;
    }

    public void showUserInfo(){
        System.out.println(userName + "님의 남은 돈은 " + money + "입니다.");
    }


}
