package javaBasic;

import model.Animal;
import model.Cat;
import model.Dog;

public class FC16 {
    public static void main(String[] args) {
        //Dog 객체를 생성하는 방법 3가지
        Dog d1 = new Dog(); //직접 접근
        //Dog를 직접 만든 사람은 직접 접근이 가장 best,, but 코드를 모른다면 불가능함!!
        Animal d2 = new Dog(); //간접접근 (Upcasting)
        Object d3 = new Dog(); //자바에서 제공하는 root 클래스

        d2.eat(); //개처럼 먹다.
        d2 = new Cat();
        d2.eat(); //고양이처럼 먹다.
    }
}
