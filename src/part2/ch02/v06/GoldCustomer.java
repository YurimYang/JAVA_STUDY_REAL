package part2.ch02.v06;

public class GoldCustomer extends Customer{

    double saleRatio;

    //기존 Customer의 기본 생성자를 super로 받아와야함 !
    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        saleRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price*saleRatio);
    }




}
