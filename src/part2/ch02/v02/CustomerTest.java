package part2.ch02.v02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cus1 = new Customer();
        cus1.setCustomerName("양유림");
        cus1.setCustomerId(10010);
        cus1.bonusPoint = 1000;

        System.out.println(cus1.showCustomerInfo());

        VIPCustomer cus2 = new VIPCustomer();
        cus2.setCustomerName("배성현");
        cus2.setCustomerId(10011);
        cus2.bonusPoint = 10000;

        System.out.println(cus2.showCustomerInfo());

    }
}
