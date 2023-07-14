package part2.ch02.v03;

import part2.ch02.v03.Customer;
import part2.ch02.v03.VIPCustomer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cus1 = new Customer(10010,"양유림");
//        cus1.setCustomerName("양유림");
//        cus1.setCustomerId(10010);
        cus1.bonusPoint = 1000;

        System.out.println(cus1.showCustomerInfo());

        Customer cus2 = new VIPCustomer(10011,"배성현");
//        cus2.setCustomerName("배성현");
//        cus2.setCustomerId(10011);
        cus2.bonusPoint = 10000;

        System.out.println(cus2.showCustomerInfo());

    }
}
