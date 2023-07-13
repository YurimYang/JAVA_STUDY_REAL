package part2.ch01.v15;

public class TaxiTest {
    public static void main(String[] args) {
        User user1 = new User("Edward", 20000);
        Taxi taxi1 = new Taxi("잘 간다 운수", 10000);
        user1.takeTaxi(taxi1);
        user1.showUserInfo();
        taxi1.showTaxiInfo();
    }
}
