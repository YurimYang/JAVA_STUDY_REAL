package javaBasic;

import model.*;

public class FC19 {
    public static void main(String[] args) {
        //2. 다형성 인수 사용
        Dog d = new Dog();
        Cat c = new Cat();
        //Animal[], Object[]로 이동 : 다른 타입으로 변형
        display(d);
        display(c);

    }

    //오버로딩 : 확장성 && 유지보수가 어려움!
//    private static void display(Dog d) {
//    }
//    private static void display(Cat c) {
//    }

    //그러므로, Object,Animal 를 사용해서 1개의 메소드로만 !!
    private static void display(Animal anis){
        // 재정의를 하지 않으면 다형성을 보장하지 않는다.
        anis.eat(); //다형성, 동적바인딩(상속 => 재정의 => upcasting)
    }

//    private static void display(Object o){
//        if(o instanceof Dog){
//            ((Dog) o).eat();
//        } else if(o instanceof Cat){
//            ((Cat) o).eat();
//            ((Cat) o).night();
//        }
//    }
}
