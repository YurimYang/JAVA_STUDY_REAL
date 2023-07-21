package part2.ch02.v15;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.order();
        customer.sell();
        customer.hello();

        Buy buyer = customer; //업캐스팅(Buy를 상속받은 customer를 Buy로 업캐스팅)
        //업캐스팅은 자동으로 = 묵시적
        //sell과 hello()와 같은 메서드는 사용할 수 없음!
        buyer.buy();
        buyer.order();


        Sell seller = customer; //업캐스팅(''_
        seller.sell();
        seller.order();
    }
}
