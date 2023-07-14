package part2.ch02.v02;

public class VIPCustomer extends Customer{
    //Customer 클래스와 유사하기에, 상속받으면 됨!
    //단, private는 외부 클래스에서 사용하지 못함
    //즉, 하위 클래스는 상속받아 사용할 수 있도록 private -> protected로 변경
    double saleRatio;
    private int agentID;

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID(){
        return agentID;
    }
}
