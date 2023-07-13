package part2.ch01.v15;

public class Taxi {
    String taxiName;
    int money = 0;
    int price;


    public Taxi (String taxiName, int price){
        this.taxiName = taxiName;
        this.price = price;
    }

    public void takeTaxi(int price){
        this.money += price;
    }

    public void showTaxiInfo(){
        System.out.println(taxiName + "수입은" + money + "입니다.");
    }
}
