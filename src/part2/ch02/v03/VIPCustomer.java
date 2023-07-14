package part2.ch02.v03;

public class VIPCustomer extends  Customer {
    double saleRatio;
    private int agentID;

    //대안1. 직접 VIPCustomer 생성자 만들어주기
    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

    }

    //대안2. 기존 default VIPCustomer 안에 super()수정해주기

//    public VIPCustomer(){
//        //super(); : 직접 안써도 컴파일러가 넣어줌 ! (묵시적호출)4
//        super(0,"양유림");
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//
//        System.out.println("VIPCustomer() call");
//    }

    public int getAgentID(){
        return agentID;
    }
}
