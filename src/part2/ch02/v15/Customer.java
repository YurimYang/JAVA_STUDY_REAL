package part2.ch02.v15;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("customer sell");
    }

    @Override
    public void sell() {
        System.out.println("customer buy");
    }


    @Override
    public void order() {
        Buy.super.order(); //1. Buy의 order를 사용하는 경우
        //Sell.super.order(); //2. Sell의 order를 사용하는 경우
        //3. 직접 재정의 하는경우
        System.out.println("customer order");
    }

    public void hello(){
        System.out.println("hello~");
    }
}
