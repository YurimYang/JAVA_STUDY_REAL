package part2.ch02.v04;

public class VIPCustomer extends Customer {
    double saleRatio;
    private int agentID;

    //대안1. 직접 VIPCustomer 생성자 만들어주기
    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

    }

    @Override //annotation
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * saleRatio);
        return price;
    }

    public int getAgentID(){
        return agentID;
    }
}
