package part2.ch02.v06;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer cus1 = new Customer(10010, "Tomas");
        Customer cus2 = new Customer(10011, "James");
        Customer cus3 = new GoldCustomer(10111, "Kim");
        Customer cus4 = new GoldCustomer(11111, "Susan");
        Customer cus5 = new VIPCustomer(10000, "Kelly");

        customerList.add(cus1);
        customerList.add(cus2);
        customerList.add(cus3);
        customerList.add(cus4);
        customerList.add(cus5);

        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;
        for(Customer customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이" + cost +"원 지불 했다.");
            System.out.println(customer.getCustomerName()+ "님의 현재 보너스 포인트는 " + customer.bonusPoint + " 입니다.");
        }

    }
}
