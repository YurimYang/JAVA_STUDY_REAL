package part2.ch01.v08;

public class FoodTest {
    public static void main(String[] args){
        Food order = new Food();
        order.orderNum = "20201102003";
        order.orderPhoneNum = "01023450001";
        order.orderAddress = "서울시 강남구 역삼동 111-333";
        order.date = 20201102;
        order.time = 130258;
        order.price = 35000;
        order.menuNum = 0003;


        System.out.println("주문 접수 번호 : " + order.orderNum);
        System.out.println("주문 핸드폰 번호 : " + order.orderPhoneNum);
        System.out.println("주문 집 주소 : " + order.orderAddress);
        System.out.println("주문 날짜 : " + order.date);
        System.out.println("주문 시간 : " + order.time);
        System.out.println("주문 가격 : " + order.price);
        System.out.println("메뉴 번호 : " + order.menuNum);


    }
}
