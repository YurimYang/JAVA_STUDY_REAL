package part2.ch02.v04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cus1 = new Customer(10010,"양유림");
//        cus1.setCustomerName("양유림");
//        cus1.setCustomerId(10010);
        int price = cus1.calcPrice(1000);
        cus1.bonusPoint = 1000;

        System.out.println(cus1.showCustomerInfo() + price);

        Customer cus2 = new VIPCustomer(10011,"배성현");
//        cus2.setCustomerName("배성현");
//        cus2.setCustomerId(10011);
        int price2 = cus2.calcPrice(1000); //서로 다른 calcPrice가 호출됨
        cus2.bonusPoint = 10000;

        System.out.println(cus2.showCustomerInfo() + price2);

        Customer vc = new VIPCustomer(12345, "noname");
        System.out.println(vc.calcPrice(1000));

    }
}
